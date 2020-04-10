package com.example.gpspringboot.mybatismapper.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "country")
public class Country {
    @Id
    private Integer id;
    private String  countryname;
    private String  countrycode;
}
