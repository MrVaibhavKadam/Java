package p6;

import static p6.Utils.computeAnyOperation;

public class Tester {

	public static void main(String[] args) {
		// add 2 numbers n display the result
		System.out.println(computeAnyOperation(10, 20, (a, b)-> a+b));
		// subtract 2 numbers n display the result
		System.out.println(computeAnyOperation(10, 20, (a, b)-> a-b));
		// Multiply 2 numbers n display the result
		System.out.println(computeAnyOperation(10, 20, (a, b)-> a*b));
        //can you assign entire behaviour and functionality to a variable??YES:using Functional i/f ref.
		Operation division=(c, d)->c/d;
		System.out.println(computeAnyOperation(14, 7, division));
		
	}

}
//In java befor lambda function it is not possible to  directly pass the behaviour you have to first wrap the 
//behaviour in implementation class and then pass the instance.
