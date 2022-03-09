package com.springCore.cstr;

import java.util.List;

public class Emp {
	
	private String name;
	private int empId;
	private Dept dpt;
	public Emp(String name, int empId, Dept dpt) {
		super();
		this.name = name;
		this.empId = empId;
		this.dpt = dpt;
	}


	@Override
	public String toString() {
		System.out.println("Displaying value");
		return this.name +" : "+ this.empId +" is in "+this.dpt;
				
	}

	public void init() {
		System.out.println("Inside init method");
	}
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
	

}
