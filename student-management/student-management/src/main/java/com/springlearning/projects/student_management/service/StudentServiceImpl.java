package com.springlearning.projects.student_management.service;

import com.springlearning.projects.student_management.entity.Student;
import com.springlearning.projects.student_management.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student getById(int id) {
        return studentRepo.getReferenceById(id);
    }

    @Override
    public String delete(int id) {
        studentRepo.deleteById(id);
        return "Data deleted Successfully";
    }
}
