package com.rapipay.app.model;

import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import java.util.Iterator;  

@Component
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
	@GenericGenerator(name = "seq", strategy = "increment")
	private int Sid;
	private String name;
	private Set<Course> course;
	private Course courseobj;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Student(int sid, String name,  Course courseobj) {
		super();
		Sid = sid;
		this.name = name;
		this.course = course;
		this.courseobj = courseobj;
	}


	public Course getCourseobj() {
		return courseobj;
	}


	public void setCourseobj(Course courseobj) {
		this.courseobj = courseobj;
	}


	
	public int getSid() {
		return Sid;
	}

	public void setSid(int sid) {
		Sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}
	
	public void printInfo(){  
	    System.out.println(Sid+" "+name);  
	    System.out.println("Courses are:");  
	    Iterator<Course> itr=course.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
	
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", name=" + name + ", course=" + course + "]";
	}


}
