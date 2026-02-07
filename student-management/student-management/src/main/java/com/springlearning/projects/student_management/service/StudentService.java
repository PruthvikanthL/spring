package com.springlearning.projects.student_management.service;

import com.springlearning.projects.student_management.entity.Student;

import java.util.List;

public interface StudentService {
    public Student addStudent(Student student);
    public List<Student> getStudents();
    public Student getById(int id);
    public String delete(int id);
}
