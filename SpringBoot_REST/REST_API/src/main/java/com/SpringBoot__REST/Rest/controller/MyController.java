package com.SpringBoot__REST.Rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot__REST.Rest.entities.Course;
import com.SpringBoot__REST.Rest.services.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService courseservice;
	
	
	@GetMapping("/home")
	public String home()
	{
		return "This is home";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return courseservice.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getcourse(@PathVariable String courseId)
	{
		return this.courseservice.getcourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addcourse(@RequestBody Course course)
	{
		return this.courseservice.addCourse(course);
	}
	
}
