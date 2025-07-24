package com.simpleforms.management.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class ScholarshipController {
    public ScholarshipController(){
        System.out.println("Running the ScholarshipController constructor");
    }
    @RequestMapping("/scholarshipapply")
    public String onScholarshipapply(@RequestParam String studentName, @RequestParam String school, @RequestParam String income,
                                     @RequestParam String marks, @RequestParam String scholarshipType, Model model){
        System.out.println("\nStudent Scholarship Details");
        System.out.println("StudentName :"+studentName);
        System.out.println("School :"+school);
        System.out.println("Income :"+income);
        System.out.println("Marks :"+marks);
        System.out.println("ScholarshipType :"+scholarshipType);

        model.addAttribute("studentName",studentName);
        model.addAttribute("school",school);
        model.addAttribute("income",income);
        model.addAttribute("marks",marks);
        model.addAttribute("scholarshipType",scholarshipType);

        return "ScholarshipFinal.jsp";
    }
}
