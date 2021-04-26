package com.spring_orm.mySpringORM.dao;

import java.util.List;

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
	
	//get single data
	public Student getStudent(int student_id)
	{
		return this.hibernateTemplate.get(Student.class,student_id);
	}
	
	//get all object/data
	public List<Student> getAllStudent()
	{
		return this.hibernateTemplate.loadAll(Student.class);
	}
	
	
	//delete data
	@Transactional
	public void deleteStudent(int student_id)
	{
		
		Student student=this.hibernateTemplate.get(Student.class,student_id);
		this.hibernateTemplate.delete(student);
	}
	
	
	//update data
	@Transactional
	public void updateStudent(int student_id)
	{
		this.hibernateTemplate.update(student_id);
	}
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	
}
