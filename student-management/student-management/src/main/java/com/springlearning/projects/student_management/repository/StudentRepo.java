package com.springlearning.projects.student_management.repository;

import com.springlearning.projects.student_management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
