package com.burakkutbay.spring_problemdetails_example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.URI;
import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public ProblemDetail studentNotFoundException(StudentNotFoundException e) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
        problemDetail.setTitle("Student not found!");
        problemDetail.setType(URI.create("https://http.cat/status/404"));
        problemDetail.setProperty("errorCategory", "Generic");
        problemDetail.setProperty("timestamp", Instant.now());
        return problemDetail;
    }
}
