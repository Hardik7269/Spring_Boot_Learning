package com.learning.spring;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
//when hit /controller
//course details : id, name, author
	@RequestMapping("/course")
	public List<Course> retriveAllCourses(){
		return Arrays.asList(new Course(
				1 , "Learn Fortnite" , "Hardik"),
				new Course(
				2, "Learn valorant" , "RudeCavaler"),
				new Course(3, "Learn DSA" , "Hardik"));
	}
}
