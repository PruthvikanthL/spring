package com.springlearning.projects.employee_management.service;

import com.springlearning.projects.employee_management.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public String register(Employee employee);
    public List<Employee> fetchEmp();
}
