package java8_features;
import static java.lang.Math.*;
public class OtherFormula implements Formula {

	@Override
	public int computes(int a, int b) {
		System.out.println("Overriding form of default method:");
		return a-b;
	}

	@Override
	public double squarrIt(double a, double b) {
		System.out.println("implementation of abstract method: "+this.getClass().getName() );
		return pow(a+b, 2);
	}
	
	

}
