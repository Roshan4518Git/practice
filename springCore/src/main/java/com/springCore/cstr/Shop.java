package com.springCore.cstr;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Shop implements InitializingBean, DisposableBean{
	private String biscuit;
	private int price;
	@Override
	public String toString() {
		return "Shop [biscuit=" + biscuit + ", price=" + price + "]";
	}
	public String getBiscuit() {
		return biscuit;
	}
	public void setBiscuit(String biscuit) {
		this.biscuit = biscuit;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Bean destroyed");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean initialized");
		
	} 

}
