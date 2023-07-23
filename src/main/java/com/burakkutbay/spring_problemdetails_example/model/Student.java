package com.burakkutbay.spring_problemdetails_example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private String surName;
    private String schoolNumber;
    private String schoolName;
}
