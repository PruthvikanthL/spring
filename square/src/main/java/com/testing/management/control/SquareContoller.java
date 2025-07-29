package com.testing.management.control;

import com.testing.management.dto.SquareDto;
import com.testing.management.service.SquareServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SquareContoller {
    @GetMapping({"","/"})
    public String onPerfrom(Model model){
        model.addAttribute("square",new SquareDto());
        return "square";
    }
    @Autowired
    SquareServiceImpl service;

    @PostMapping("/square")
    public String onsqured(@ModelAttribute("square") SquareDto dto,Model model ){
        int num=service.doSquare(dto);
        model.addAttribute("num",num);
        return "result";

    }

}
