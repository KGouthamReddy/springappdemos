package com.samples.S01springcoredi;

import java.util.Map;

public class Customer {
	private int pid;
	private Map<Integer, String> products;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Map<Integer, String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Customer [pid=" + pid + ", products=" + products + "]";
	}
	
	
}
