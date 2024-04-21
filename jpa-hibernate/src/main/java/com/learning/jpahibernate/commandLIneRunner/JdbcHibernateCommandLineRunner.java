package com.learning.jpahibernate.commandLIneRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.jpahibernate.course.Course;
import com.learning.jpahibernate.course.jdbc.commandLineJpaRepo;

import jakarta.transaction.Transactional;

@Component
public class JdbcHibernateCommandLineRunner implements CommandLineRunner {

	@Autowired
	private commandLineJpaRepo  jpaRepo;
	
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		jpaRepo.insert(new Course(1,"asdf" , "qerw"));
		jpaRepo.insert(new Course(2,"asdf" , "qerw"));
		jpaRepo.insert(new Course(32,"asdf" , "qerw"));
		jpaRepo.insert(new Course(3,"asdf" , "qerw"));
		
		System.out.println(jpaRepo.find(32).toString());
		
		jpaRepo.removeFromDb(32);
	}

}
