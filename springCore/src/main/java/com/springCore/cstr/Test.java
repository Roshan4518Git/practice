package com.springCore.cstr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/cstr/cstrConfig.xml");
//		Emp emp = (Emp) context.getBean("employee");
//		System.out.println(emp);
		context.registerShutdownHook();
		Shop shop = (Shop) context.getBean("shop");
		System.out.println(shop);
		System.out.println("\n+++++++++++++++++++++++++++\n");
		
		Tree tree = (Tree)context.getBean("tree");
		System.out.println(tree);
	}

}
