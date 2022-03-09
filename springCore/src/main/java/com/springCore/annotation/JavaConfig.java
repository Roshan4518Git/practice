package com.springCore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Subject getSubject() {
		
		return new Subject();
	}
	
	@Bean(name = {"student","classmate","freind"})
	public Student getStudent() {
	
		Student student = new Student(getSubject());
		return student;
		
	}
}
