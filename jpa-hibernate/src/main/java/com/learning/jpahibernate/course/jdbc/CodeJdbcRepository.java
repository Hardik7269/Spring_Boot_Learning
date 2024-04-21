package com.learning.jpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learning.jpahibernate.course.Course;

@Repository
public class CodeJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTamplate;
	
	
	private static String INSERT_QUERY = """ 
			insert into course(id , name, author)  
			values (? , ? , ?);
			"""; 
	public void insert(Course course) {
		springJdbcTamplate.update(INSERT_QUERY , 
				course.getId() , course.getName() , course.getAuthor());
	}
}
