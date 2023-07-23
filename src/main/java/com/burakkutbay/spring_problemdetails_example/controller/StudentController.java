package com.burakkutbay.spring_problemdetails_example.controller;

import com.burakkutbay.spring_problemdetails_example.exception.StudentNotFoundException;
import com.burakkutbay.spring_problemdetails_example.model.Student;
import com.burakkutbay.spring_problemdetails_example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/")
    public Student save(@RequestBody Student student) {
        return studentService.add(student);
    }

    @GetMapping("/{schoolNumber}")
    public Student getStudent(@PathVariable String schoolNumber) throws StudentNotFoundException {
        return studentService.getStudent(schoolNumber);
    }
}
