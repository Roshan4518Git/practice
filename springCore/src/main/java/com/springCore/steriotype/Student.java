package com.springCore.steriotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Roshan")
	private String studentName;
	@Value("Mukutban")
	private String studentCity;
	@Value("#{temp}")
	private List<String> courses;
	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentCity=" + studentCity + "]";
	}
}
