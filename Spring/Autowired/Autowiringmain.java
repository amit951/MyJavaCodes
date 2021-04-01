package com.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowiringmain {

	public static void main(String[] args) {
		
ApplicationContext context=new ClassPathXmlApplicationContext("com/autowired/Autowiringconfig.xml");
emp e=(emp)context.getBean("bean1");
System.out.println(e);

	}

}
