package tester;

import fruits.Fruit;
import fruits.Mango;
import fruits.Orange;

public class TestFruit {

	public static void main(String[] args) {
	    //super cls ref, super cls instance,sub cls ref, sub cls instace
		System.out.println("Checking fruit taste");
	    Fruit f1=new Fruit("Some fruit");//Direct referencing:super cls ref-->super cls instance
	    f1.taste();
	    System.out.println("Checking Mangoes taste");
	    Mango m1=new Mango("Mango1");//Direct referencing:Sub cls ref--> Sub cls instance.
	    m1.taste();
	    Fruit ref;//super cls ref.
	    ref=m1;//javac performs implicit: up casting
	    System.out.println("checking Mangoes taste : indirect ref");
        ref.taste();//javac resolves it by type of reference JVM resolves it by type of object:Run time polymorphism
        ref =new Orange("Mandarine");
        ref.taste();
	}

}
