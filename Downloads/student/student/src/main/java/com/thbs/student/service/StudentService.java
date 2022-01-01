package com.thbs.student.service;

import com.thbs.student.model.Student;
import com.thbs.student.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
 StudentRepo studentRepo;
    public List<Student> studentList=new ArrayList<>();

    public List<Student> studentList()
    {
        return  studentList;
    }
    public Student addStudent(Student student)
    {
       return  studentRepo.save(student);
    }
}
