package java8_features;
import static java.lang.Math.*;
public class MyFormula implements Formula {

	@Override
	public double squarrIt(double a, double b) {
		System.out.println("implementation of abstract method: "+this.getClass().getName() );
		return pow(a-b, 2);
	}

}
