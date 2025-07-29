package com.icecream.management.controller;

import com.icecream.management.dto.IceCreamDto;
import com.icecream.management.service.IceCreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IceCreamController {
    public IceCreamController(){
        System.out.println("Running the IceCreamController ");
    }
    @Autowired
    private IceCreamService service;

    @GetMapping({ "", "/" })
    public String onshow(Model model){
        model.addAttribute("order",new IceCreamDto());
        return "order";
    }

    @PostMapping("/order")
    public String Onsubmit(@ModelAttribute("order") IceCreamDto dto,Model model){
        double total=service.Counttotal(dto);
        model.addAttribute("name",dto.getName());
        model.addAttribute("total",total);
        return "success";
    }
}
