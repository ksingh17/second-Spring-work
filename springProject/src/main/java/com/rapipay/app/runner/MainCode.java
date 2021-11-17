package com.rapipay.app.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rapipay.app.model.Course;
import com.rapipay.app.model.Student;



public class MainCode {
public static void main(String[] args) {
	
	ApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
	

			
	
	Student s1 = (Student)spring.getBean("student-1");
	s1.printInfo();
	
	
	
	
}
}
