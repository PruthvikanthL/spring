package com.simpleforms.management.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class MedicalController {
    public MedicalController(){
        System.out.println("Running the MedicalController Const");
    }
@RequestMapping("/medicalhelp")
    public String onMedicalhelp(@RequestParam String patientName, @RequestParam String age, @RequestParam String condition,
                                @RequestParam String location, @RequestParam String emergencyType, @RequestParam String hospital, Model model){

        System.out.println("\nMedical Requst Details");
        System.out.println("Patient Name :"+patientName);
        System.out.println("Age :"+age);
        System.out.println("Condition :"+condition);
        System.out.println("Location :"+location);
        System.out.println("EmergencyType :"+emergencyType);
        System.out.println("Hospital :"+hospital);

        model.addAttribute("patientName",patientName);
        model.addAttribute("age",age);
        model.addAttribute("condition",condition);
        model.addAttribute("location",location);
        model.addAttribute("emergencyType",emergencyType);
        model.addAttribute("hospital",hospital);
        return "MedicalFinal.jsp";
    }
}
