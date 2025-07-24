package com.simpleforms.management.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class JobController {
    public JobController(){
        System.out.println("Job Controller Class Constructor is Running");
    }
    @RequestMapping("/submit")
    public String onSubmit(@RequestParam String firstname,@RequestParam String lastname,@RequestParam String education,
                           @RequestParam String skills,@RequestParam String experience,@RequestParam String job,
                           Model model){
        System.out.println("\nJob Application From Details");
        System.out.println("First Name :"+firstname);
        System.out.println("Last Name :"+lastname);
        System.out.println("Education  :"+education);
        System.out.println("Skills :"+skills);
        System.out.println("Experience :"+experience);
        System.out.println("Looking Job :"+job);

        model.addAttribute("firstname",firstname);
        model.addAttribute("lastname",lastname);
        model.addAttribute("education",education);
        model.addAttribute("skills",skills);
        model.addAttribute("experience",experience);
        model.addAttribute("job",job);
        return "JobFinal.jsp";

    }

}
