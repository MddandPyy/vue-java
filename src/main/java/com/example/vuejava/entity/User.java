package com.example.vuejava.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class User {
    private String id;
    private String name;
    private Integer age;
    private Date time;
}
