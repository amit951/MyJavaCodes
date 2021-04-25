package com.spring_orm.mySpringORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring_orm.mySpringORM.dao.Student_Dao;
import com.spring_orm.mySpringORM.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
		
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
    	Student_Dao s=(Student_Dao)context.getBean("studentDAO",Student_Dao.class);
    	Student s1=new Student(45,"Amit","Pune");
    	int x=s.insert(s1);
    	System.out.println("This is the output :"+ x);
    	
    	
    }
}
