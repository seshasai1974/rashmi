package com.java.serialization.examples;
import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = -1L; // important for serizable class

	private String name;
	private String gender;
	private int age;
	
	static String company="Seshasai Works at MNC";

	//private String role;
	
	private transient String role;

	public Employee(String n) {
		this.name = n;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee:: Name=" + this.name + " Age=" + this.age + " Gender=" + this.gender + " Role=" + this.role;
	}

}