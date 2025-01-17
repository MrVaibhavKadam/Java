package p5;

import static p5.Utils.computeAnyOperation;

public class Tester {

	public static void main(String[] args) {
		// add 2 numbers n display the result
		System.out.println(computeAnyOperation(10, 20, new Operation() {

			@Override
			public double anyOperation(double a, double b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		}));// @run time:Adder's anyOperation() method call's
		// subtract 2 numbers n display the result
		System.out.println(computeAnyOperation(10, 20, new Operation() {

			@Override
			public double anyOperation(double a, double b) {
				// TODO Auto-generated method stub
				return a - b;
			}
		}));
		// Multiply 2 numbers n display the result
		System.out.println(computeAnyOperation(10, 20, new Operation() {

			@Override
			public double anyOperation(double a, double b) {
				// TODO Auto-generated method stub
				return a * b;
			}
		}));

	}

}
//In java befor lambda function it is not possible to  directly pass the behaviour you have to first wrap the 
//behaviour in implementation class and then pass the instance.
