package com.springCore.annotation;

public class Student {
	
	private Subject sub;

	
	public Student(Subject sub) {
		super();
		this.sub = sub;
	}
	
	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

	public void study() {
		this.sub.course();
		System.out.println("Iam Studying");
	}

}
