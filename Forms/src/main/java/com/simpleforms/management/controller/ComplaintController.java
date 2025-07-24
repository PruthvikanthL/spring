package com.simpleforms.management.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class ComplaintController {
    public ComplaintController(){
        System.out.println("Runnning the ComplaintController Const");
    }
    @RequestMapping("/complaint")
    public String onComplaint(@RequestParam String name,@RequestParam String contact,@RequestParam String email,
                              @RequestParam String complaint,@RequestParam String location,@RequestParam String issue,
                              Model model){

        System.out.println("\nComplaint Detials");
        System.out.println("Name :"+name);
        System.out.println("Contact :"+contact);
        System.out.println("Email :"+email);
        System.out.println("Complaint :"+complaint);
        System.out.println("Location :"+location);
        System.out.println("Issue :"+issue);

        model.addAttribute("name",name);
        model.addAttribute("contact",contact);
        model.addAttribute("email",email);
        model.addAttribute("complaint",complaint);
        model.addAttribute("location",location);
        model.addAttribute("issue",issue);
        return "ComplaintFinal.jsp";
    }
}
