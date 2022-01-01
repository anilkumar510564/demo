package com.thbs.student.controller;

import com.thbs.student.model.Student;
import com.thbs.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
@PostMapping("/addstudent")
    public Student getStudentList( @RequestBody Student student)
    {
        System.out.println("student"+student+"Added succesfully");
      return studentService.addStudent(student);


    }
}
