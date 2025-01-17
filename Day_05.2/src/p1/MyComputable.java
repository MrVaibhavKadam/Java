package p1;

public class MyComputable implements Computable {
	@Override//overriding the implementation method:It is compulsory
	public double compute (double a , double b) {
		//implementation classes can directly access interface(i/f)constant
		System.out.println("i/f constant "+data);
		return a+b;
	}
	//This class can contain additional functionality.
	public boolean isEven(int num) {
	return num%2==0;
	}

}
