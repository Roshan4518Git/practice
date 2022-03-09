package com.springJdbc.dao;

import java.util.List;

import com.springJdbc.entities.Courses;

public interface CourseDao {
	
	public int insert(Courses course);
	
	public int change(Courses course);
	
	public int reset(int courseId);
	
	public Courses getCourse(int courseId);
	
	public List<Courses> printTable();
}
