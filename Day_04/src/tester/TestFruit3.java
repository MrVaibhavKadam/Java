package tester;
import fruits.Fruit;
import fruits.Mango;
import fruits.Orange;
public class TestFruit3 {
	
	public static void main(String args[]) {
		Fruit ref=new Mango("Mango");
		ref.taste();//No javac err:why--> upcasting
        // ref.pulp();//javac error because javac goes by ref type there 
		//is no pulp method in Fruit cls 
		//for solving this problem we have to do downcasting expllicitly.
		//DownCasting by programer
		((Mango)ref).pulp();
		 ref=new Orange("Orange1");//upcasting
		 ref.taste();
		 ((Orange)ref).juice();
	    //((Mango)ref).pulp();//here we are trying wrong casting you cant cast orange to mango
		                     //run time exception:java.lang.ClassCastException
		//Downcasting is requid when you have to access subclass specific functionality.
	}

}
