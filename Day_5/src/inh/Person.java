package inh;

public class Person {
 private String firstName, lastName;
 //Paramertised constructor
 
 public Person(String firstName, String lastName) {
	 //super(); is automatically called
	 System.out.println("In person constructor");
	 this.firstName=firstName;
	 this.lastName=lastName;
 }
// public  Person() {}
 
}
