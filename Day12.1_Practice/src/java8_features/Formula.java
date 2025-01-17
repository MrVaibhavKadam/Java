package java8_features;

public interface Formula {
	
	int data = 100;
	//javac add: public abstract before method(i.e double)
	double squarrIt(double a, double b);
	
	//javac added  only "public" keyword
	default int computes(int a, int b) {
		return a+b;
	}
}
