package com.springCore.cstr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Tree {
	private String leafs;
	private String Flowers;
	
	public Tree(String leafs, String flowers) {
		super();
		this.leafs = leafs;
		Flowers = flowers;
	}
	
	@Override
	public String toString() {
		return "Tree [leafs=" + leafs + ", Flowers=" + Flowers + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Bean Initialized of tree");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Bean Destroyed of tree");
	}
}
