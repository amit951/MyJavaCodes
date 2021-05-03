package com.SpringBoot__REST.Rest.services;

import java.util.List;

import com.SpringBoot__REST.Rest.entities.Course;

public interface CourseService {

	
	public List<Course> getCourses();
	
	public Course getcourse(long courseId);
	
	public Course addCourse(Course course);
}
