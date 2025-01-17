package p3;

public class ImpleClass2 implements Computable,Printable {
	@Override
	public void print(String mesg) {
		System.out.println("Print a mesg in uppercase "+mesg.toUpperCase());
	}
	@Override
	public double compute(double d1, double d2) {
		return d1+d2;
	}

}
