package p3;

public class ImpleClass1 implements Computable,Printable {

	@Override
	public void print(String mesg) {
		System.out.println("Print a mesg "+mesg);
		
	}

	@Override
	public double compute(double d1, double d2) {
		// TODO Auto-generated method stub
		return d1*d2;
	}
	

}
