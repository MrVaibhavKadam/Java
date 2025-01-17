package com.app.core;
/*
 * 1.1 Create Student class , having rollNo(int),name,dob(localdate),current subject(enum :   etc), gpa(double) ,address;
Add a constructor to init all data members except address
Add toString .
Add a method to assign address to student.(setter)
 */

import java.time.LocalDate;
import static java.time.LocalDate.*;
import static java.time.temporal.ChronoUnit.*;

public class Student {
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public double getGpa() {
		return gpa;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public void setCurrentSubject(Subject currentSubject) {
		this.currentSubject = currentSubject;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public LocalDate getDob() {
		return dob;
	}

	public Subject getCurrentSubject() {
		return currentSubject;
	}

	public String getName() {
		return name;
	}

	private int rollNo;
	private String name;
	private LocalDate dob;
	private Subject currentSubject;
	private double gpa;
	private Address adr;
	public Student(int rollNo, String name, LocalDate dob, Subject currentSubject, double gpa) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.currentSubject = currentSubject;
		this.gpa = gpa;
		 
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dob=" + dob + ", currentSubject=" + currentSubject
				+ ", gpa=" + gpa + ", Address=" + adr + "]";
	}
	
	public void assignAddress(Address a)
	{
		this.adr=a;
	}
	//add a method compute age
	public long computeAge() {
		
		return YEARS.between(dob, now());
	}

}
