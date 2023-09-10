package com.sky.java.SpringMVCDemo.Model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Person {
    private String firstName;
    private int age;
    private LocalDateTime dob;

}
