package com.springlearning.projects.employee_management.service;

import com.springlearning.projects.employee_management.entity.Employee;
import com.springlearning.projects.employee_management.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplimentaion implements EmployeeService{
    private final EmployeeRepository employeeRepository;
    public EmployeeServiceImplimentaion(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }
    @Override
    public String register(Employee employee) {
        employeeRepository.save(employee);
        return "Done";
    }

    @Override
    public List<Employee> fetchEmp() {
        return employeeRepository.findAll();
    }
}
