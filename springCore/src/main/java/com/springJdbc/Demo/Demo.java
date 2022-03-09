package com.springJdbc.Demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJdbc.dao.CourseDao;
import com.springJdbc.entities.Courses;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hello Spring JDBC");
		ApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfig.class);
		CourseDao dao = context.getBean("courseDao",CourseDao.class);
		Courses course = new Courses();
		
//		int result = dao.reset(2);
//		System.out.println("Data deleted succesfully "+result);
//		Courses  course1 = dao.getCourse(1);
	
//		course.setId(2);
//		course.setSubject("DBMS");
//		course.setCourseYear(2022);
//		course.setName("Prajwal");
//		
//		int result = dao.insert(course);
//		System.out.println("data added succesfully "+result);
		
		List<Courses> course2 = dao.printTable();
		for (Courses cs : course2) {
			System.out.println(cs);
		}
//		Courses course1 = course.getCourse();
		
		
		
//		course.setSubject("DBMS");
//		course.setCourseYear(2016);
//		course.setName("Anandi");
//		course.setId(4);
		
//		int result = dao.change(course);
//		System.out.println("Data updated succesfully "+result);
		
		
	}

}
