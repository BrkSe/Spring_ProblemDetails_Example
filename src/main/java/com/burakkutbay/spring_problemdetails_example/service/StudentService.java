package com.burakkutbay.spring_problemdetails_example.service;

import com.burakkutbay.spring_problemdetails_example.exception.StudentNotFoundException;
import com.burakkutbay.spring_problemdetails_example.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> studentList = new ArrayList<>();

    public Student add(Student student) {
        studentList.add(student);
        return student;
    }

    public Student getStudent(String schoolNumber) {
        return studentList.stream()
                .filter(student -> student.getSchoolNumber().equals(schoolNumber))
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException(schoolNumber));

    }
}
