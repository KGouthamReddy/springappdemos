package com.samples.S01springcoredi.propertyfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S01springcoredi/propertyfile/SpringConfig.xml");
		MyDAO dao = (MyDAO) springContainer.getBean("dao");
		System.out.println(dao);
	
	}
}