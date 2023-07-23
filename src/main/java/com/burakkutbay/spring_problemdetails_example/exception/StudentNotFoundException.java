package com.burakkutbay.spring_problemdetails_example.exception;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String schoolNumber) {
        super("Student Not Found! " + schoolNumber);
    }
}
