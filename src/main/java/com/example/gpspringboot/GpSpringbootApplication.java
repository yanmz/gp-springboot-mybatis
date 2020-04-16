package com.example.gpspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//集成mybatis plus
//@org.mybatis.spring.annotation.MapperScan("com.example.gpspringboot.mybatisplus.mapper")

//集成mybatis mapper
//两者集成报错，只能选择其一
//mvn mybatis-generator:generate
@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.example.gpspringboot.mybatismapper.mapper")
public class GpSpringbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(GpSpringbootApplication.class, args);
	}

}
