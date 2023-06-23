package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//resources for API Layer (GET POST PUT DELETE)
//it talks to service layer, which then talk to data layer and all the way back
@RestController
@RequestMapping(path = "api/v1/student")

public class StudentController {
    private final StudentService studentService;
    @Autowired //for Dependency Injection
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> getStudent() {
        return studentService.getStudent();
    }
}
