package com.springJdbc.entities;

public class Courses {
	
	private int id;
	private String subject;
	private int courseYear;
	private String name;
	
	public String getSubject() {
		return subject;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Courses(int id, String subject, int courseYear, String name) {
		super();
		this.id = id;
		this.subject = subject;
		this.courseYear = courseYear;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getCourseYear() {
		return courseYear;
	}
	public void setCourseYear(int courseYear) {
		this.courseYear = courseYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", subject=" + subject + ", courseYear=" + courseYear + ", name=" + name + "]";
	}
//
}
