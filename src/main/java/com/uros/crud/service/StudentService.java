package com.uros.crud.service;

import com.uros.crud.model.Student;
import com.uros.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

}
