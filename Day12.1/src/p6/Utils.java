package p6;

public class Utils {
	//write a static method to perform any operation.
	//on 2 double args and return result.
	//1 n 2 args: double operands
	//3rd args:Functional interface ref:SINGLE ABSTRACT METHOD.
	//higher order fun/method.
	public static double computeAnyOperation(double i,double j,Operation op)
	{
		return op.anyOperation(i, j);
	}

}
