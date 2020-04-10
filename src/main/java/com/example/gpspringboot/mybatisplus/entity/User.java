package com.example.gpspringboot.mybatisplus.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "user")
public class User {
    @Id
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
