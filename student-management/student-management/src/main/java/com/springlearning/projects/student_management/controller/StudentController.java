package com.springlearning.projects.student_management.controller;

import com.springlearning.projects.student_management.entity.Student;
import com.springlearning.projects.student_management.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentServiceimpl;
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentServiceimpl.addStudent(student);
    }
    @GetMapping
    public List<Student> fetchStudents(){
        return studentServiceimpl.getStudents();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> getById(@PathVariable int id){
         Student student=studentServiceimpl.getById(id);
         return student!=null?ResponseEntity.ok(student):ResponseEntity.notFound().build();
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id){
       String status= studentServiceimpl.delete(id);
       return status;
    }
}
