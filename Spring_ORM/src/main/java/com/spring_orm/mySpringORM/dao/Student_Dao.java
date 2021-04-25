package com.spring_orm.mySpringORM.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring_orm.mySpringORM.entities.Student;

public class Student_Dao {

	
	private HibernateTemplate hibernateTemplate;
	
	//save 
	@Transactional
	public int insert(Student s)
	{
		Integer i=(Integer)this.hibernateTemplate.save(s);
		return i;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	
}
