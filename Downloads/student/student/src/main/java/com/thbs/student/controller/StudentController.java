package com.thbs.student.controller;

import com.thbs.student.model.Student;
import com.thbs.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/allStudents")
    public List<Student> listStudent()
    {
        return studentService.studentList();
    }
    @PutMapping("/updateStudents")
    public Student updateStudent(@RequestBody  Student student)
    {
        return studentService.updateStudent(student);
    }
    @GetMapping("/getstudentById/{id}")
    public Student deleteStudent(@PathVariable(name = "id") int id)
    {
        return studentService.studentByList(id);
    }
    @GetMapping("/getstudentByclassroom/{Address}")
    public  List<Student> getStudentbtclassroom(@PathVariable(name = "Address") String Address)
    {
        return studentService.fingByAddress(Address);
    }
    @DeleteMapping("/deleteById/{id}")
    public Student deleteById(@PathVariable(name = "id") int id)
    {
        return studentService.DeleteStudentId(id);
    }


}
