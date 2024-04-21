package com.learning.jpahibernate.course.jdbc;

import org.springframework.stereotype.Repository;

import com.learning.jpahibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class commandLineJpaRepo {


	@PersistenceContext
	private EntityManager em;
	
	public void insert(Course course) {
		em.merge(course);
	}
	
	public Course find(long id) {
		return em.find(Course.class, id);
	}
	public void removeFromDb(long id) {
		Course course = em.find(Course.class, id);
		em.remove(course);
	}
	
	
	
}
