package com.StandAloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandAloneMain {

	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext("com/StandAloneCollection/standaloneconfig.xml");
				NameList nl=(NameList)c.getBean("mybean");
				System.out.println(nl);
	}

}
