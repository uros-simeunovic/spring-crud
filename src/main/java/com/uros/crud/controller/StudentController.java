package com.uros.crud.controller;

import com.uros.crud.model.Student;
import com.uros.crud.repository.StudentRepository;
import com.uros.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService, StudentRepository studentRepository, StudentService studentService1) {
        this.studentService = studentService1;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
