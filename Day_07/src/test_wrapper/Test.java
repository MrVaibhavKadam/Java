package test_wrapper;

import Test_equals2.Car;

public class Test {

	public static void main(String[] args) {
		Integer i1=new Integer(123);//Boxing
		System.out.println("Befor "+i1);
		Integer i2=Integer.valueOf(12);
		int data=i1.intValue();
		Integer i3=21;//auto boxing by javac
		data=i2;//auto unboxing by javac
		Car c1=new Car(125, "red", 4582425);
		//c1++;javac err
		i1++;//Integer-->int(auto unboxing)--increment--auto boxing
        System.out.println("After "+i1);
	}

}
