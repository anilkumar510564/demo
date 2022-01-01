package com.thbs.student.service;

import com.thbs.student.model.Student;
import com.thbs.student.repository.StudentRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
 StudentRepo studentRepo;
    public List<Student> studentList=new ArrayList<>();
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    public List<Student> studentList()
    {
        return  studentRepo.findAll();
    }
    public Student addStudent(Student student)
    {
       return  studentRepo.save(student);
    }
    public Student updateStudent(Student student)
    {
        return studentRepo.save(student);
    }
    public Student studentByList(int id)
    {
        if (studentRepo.existsById(id)) {
            return studentRepo.findById(id).get();
        }
        else
        {
            LOG.error("not found");
        }
        return null;

    }
    public List<Student> fingByAddress(String  Address)
    {
        return studentRepo.findByAddress(Address);
    }
    public Student DeleteStudentId(int id)
    {
         studentRepo.deleteById(id);
         return null;
    }
}
