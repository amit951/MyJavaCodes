package com.webJPA.myspringJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyspringjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MyspringjpaApplication.class, args);
		UserDAO userdao = context.getBean(UserDAO.class);

		
		 UserJPA u=new UserJPA(); u.setId(3); u.setName("Amity"); u.setCity("Punjab");
		 
		 UserJPA uentity=userdao.save(u);
		 
		 System.out.println("This is the output : "+uentity);
		 
	}

}
