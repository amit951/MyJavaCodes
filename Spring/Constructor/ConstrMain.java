package com.constr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstrMain {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/constr/constructorconfig.xml");
		constrclass c=(constrclass)context.getBean("constrbean");
		System.out.println(c);

	}

}
