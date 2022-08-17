package com.samples.S01springcoredi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;

	public Patient() {
		System.out.println("Inside the patient constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside the setter method for id field");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	@PostConstruct
	public void methodOne() {
		System.out.println("Inside method one");
	}
	@PreDestroy
	public void methodTwo() {
		System.out.println("inside the method two");
	}
	
	
}
