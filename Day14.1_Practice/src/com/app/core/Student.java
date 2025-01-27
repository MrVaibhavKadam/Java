package com.app.core;
/*create student class, havin rollno, name, DOB, current subject(enum)
 * add a constructor to init all data members except address.
 * add toString.
 * Addmethod to assign address to student.(setter) 
 * */
import static java.time.temporal.ChronoUnit.*;
import java.time.LocalDate;
import static java.time.LocalDate.*;

public class Student {

	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Subject getCurrentSubject() {
		return currentSubject;
	}

	public void setCurrentSubject(Subject currentSubject) {
		this.currentSubject = currentSubject;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dob=" + dob + ", currentSubject=" + currentSubject
				+ ", gpa=" + gpa + ", adr=" + adr + "]";
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

public void assignAddress(Address a) {
	this.adr = a;
}

public long computeAge() {
	return YEARS.between(dob, now());
}

}
