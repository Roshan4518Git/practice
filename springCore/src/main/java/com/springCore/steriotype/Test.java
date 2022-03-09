package com.springCore.steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/steriotype/strConfig.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		System.out.println(student.getCourses());
		System.out.println(student.getCourses().getClass().getName());
	}

}
