package com.SpringBoot__REST.Rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBoot__REST.Rest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{

	
	
	List<Course> list;
	
	public CourseServiceImpl()
	{
		list=new ArrayList<>();
		list.add(new Course(569,"Amit","We do it here"));
		list.add(new Course(96,"Raj","We do it there"));
	}
	
	
	@Override
	public List<Course> getCourses() {
		
		return list;
	}


	@Override
	public Course getcourse(long courseId) {
		
		Course c=null;
		
		for(Course x:list)
		{
			if(x.getId()==courseId)
			{
				c = x;
				break;
			}
		}
		
		return c;
	}


	@Override
	public Course addCourse(Course course) {
		
		list.add(course);
		return course;
	}

}
