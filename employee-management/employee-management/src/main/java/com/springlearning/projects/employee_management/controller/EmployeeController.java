package com.springlearning.projects.employee_management.controller;

import com.springlearning.projects.employee_management.entity.Employee;
import com.springlearning.projects.employee_management.service.EmployeeService;
import com.springlearning.projects.employee_management.service.EmployeeServiceImplimentaion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeServiceImplimentaion employeeServiceImplimentaion;
    @GetMapping("/")
    public String regEmp(){
        return "empregister";
    }
    @PostMapping("/register")
    public String saveEmp(@RequestParam("empID")int empID, @RequestParam("empName")String empName,
                          @RequestParam("empAge")int empAge, @RequestParam("empGender")String empGender,
                          @RequestParam("empSalary")double empSalary, Model model){
        Employee employee=new Employee();
        employee.setEmpID(empID);
        employee.setEmpName(empName);
        employee.setEmpAge(empAge);
        employee.setEmpGender(empGender);
        employee.setEmpSalary(empSalary);
        String status=employeeServiceImplimentaion.register(employee);
        model.addAttribute("message",status);
        return "success";
    }
    @GetMapping("/emp")
    public String fetchEmployee(){
        List<Employee> employeedeatils=new ArrayList<>();
        employeedeatils=employeeServiceImplimentaion.fetchEmp();
        for(Employee e:employeedeatils){
            System.out.println("Name : "+e.getEmpName());
            System.out.println("Gender : "+e.getEmpGender());
            System.out.println("Age : "+e.getEmpAge());
            System.out.println("ID : "+e.getEmpID());
            System.out.println("Salary : "+e.getEmpSalary());
        }
         return "success";
    }
}
