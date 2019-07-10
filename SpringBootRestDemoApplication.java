package com.lti.training.springbootrestdemo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lti")    //--------- OR("com.lti")
public class SpringBootRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestDemoApplication.class, args);
	}

}
