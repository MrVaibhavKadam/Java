package com.app.core;

public class Emp {

	private int empId;
	private String name, deptName;
	private double salary;

	public Emp(int empId, String name, String deptName, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", deptName=" + deptName + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("In Emp's equal ");

		if (o instanceof Emp) {
			Emp e = (Emp)o;
			return empId == e.empId && deptName.equals(e.deptName) ;
		}
		return false;
		
	}

	@Override
	public int hashCode() {
		System.out.println("In hashCode");
		return 23 * (empId + deptName.hashCode()) ;// followed both the branches of the contract: equal objects are producing SAME
		             // HashCode and
					 // and unequal objects are producing DISTINCT HashCode.
	   //return 100; It will not give us constant performance.
	}

}
