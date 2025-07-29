package com.trinum.management.controller;

import com.trinum.management.dto.TriNumDto;
import com.trinum.management.service.TriNumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TriNumController {
    public TriNumController(){
        System.out.println("Running the TriNumController const");
    }
    @Autowired
    private TriNumService service;
    @GetMapping({"","/trinum"})
    public String onShow(Model model){
        model.addAttribute("trinum",new TriNumDto());
        return "trinum";
    }
    @PostMapping("/trinum")
    public String onSubmit(@ModelAttribute("trinum") TriNumDto dto,Model model){
        int result=service.doTri(dto);
        model.addAttribute("result",result);
        return "success";
    }
}
