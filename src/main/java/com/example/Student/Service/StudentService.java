package com.example.Student.Service;

import com.example.Student.Model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public Student getStudentById(int id)
    {
        return new Student(1,"Shyam","9988998899");
    }
}
