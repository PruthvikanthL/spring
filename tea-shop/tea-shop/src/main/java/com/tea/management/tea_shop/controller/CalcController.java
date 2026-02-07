package com.tea.management.tea_shop.controller;

import com.tea.management.tea_shop.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {
    @Autowired
    private CalcService calcService;
    @GetMapping("/")
    public String calculator(){
        return "calc";
    }
    @PostMapping("/perform")
    public String computation(@RequestParam("num1")double num1, @RequestParam("num2")double num2,
                              @RequestParam("operation")String operation, Model model){

        double result=0;
        String error="No Error";
        switch (operation){
            case "add":result=calcService.add(num1,num2);
            break;
            case "sub":result=calcService.sub(num1,num2);
            break;
            case "mul":result=calcService.mul(num1,num2);
            break;
            case "div":if(num2==0){
                error="division by zero is not possible";
            } else {
                result=calcService.div(num1,num2);
            }
            break;
            default:
                error="Invalid Choice";
                break;
        }
        model.addAttribute("message",result);
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        model.addAttribute("error",error);
        return "result";
    }
}
