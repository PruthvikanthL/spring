package com.simpleforms.management.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class TutionController {
    public TutionController(){
        System.out.println("Running TutionController Class");
    }
    @RequestMapping("/tuitionrequest")
    public String OnTuitionRequest(@RequestParam String studentName, @RequestParam String classes, @RequestParam String subject,
                                   @RequestParam String timings, @RequestParam String contact, Model model){

        System.out.println("\nStudent Tuition Details");
        System.out.println("Student Name :"+studentName);
        System.out.println("Class :"+classes);
        System.out.println("Subject :"+subject);
        System.out.println("Timings :"+timings);
        System.out.println("Contact :"+contact);

        model.addAttribute("studentName",studentName);
        model.addAttribute("classes",classes);
        model.addAttribute("subject",subject);
        model.addAttribute("timings",timings);
        model.addAttribute("contact",contact);

        return "TuitionRequestFinal.jsp";
    }
}
