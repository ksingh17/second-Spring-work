package com.rapipay.app.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@Component
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")
	@GenericGenerator(name = "seq", strategy = "increment")
	private int Cid;
	private String name;
	private float fee;

	public int getCid() {
		return Cid;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setCid(int cid) {
		Cid = cid;
	}

	public Course(int cid, String name, float fee) {
		super();
		Cid = cid;
		this.name = name;
		this.fee = fee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Course [Cid=" + Cid + ", name=" + name + ", fee=" + fee + "]";
	}

}
