package com.simpleforms.management.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class GovernmentController {
    public GovernmentController(){
        System.out.println("Running the GovernmentController const");
    }
    @RequestMapping("/register")
    public String onRegister(@RequestParam String firstname, @RequestParam String lastname, @RequestParam String aadhar, @RequestParam String address,
                             @RequestParam String scheme, @RequestParam String reason, Model model){
        System.out.println("\nGovernment Application Details");
        System.out.println("First Name :"+firstname);
        System.out.println("Last Name :"+lastname);
        System.out.println("Aadhar Number :"+aadhar);
        System.out.println("Address :"+address);
        System.out.println("Scheme :"+scheme);
        System.out.println("Reason for Applying :"+reason);

        model.addAttribute("firstname",firstname);
        model.addAttribute("lastname",lastname);
        model.addAttribute("aadhar",aadhar);
        model.addAttribute("address",address);
        model.addAttribute("scheme",scheme);
        model.addAttribute("reason",reason);

        return "GovernmentFinal.jsp";
    }

}
