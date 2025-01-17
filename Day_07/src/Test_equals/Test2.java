package Test_equals;

public class Test2 {

	public static void main(String[] args) {
		Object c1=new Car(12345,"red",50000);
		Object c2=new Car(12345,"red",50000);
		
		System.out.println(c1.equals(c2));//false(Calls object class equals method bcoz we didn't override equals method in car class)
		System.out.println(c1==c2);//false:ref eauality
		
		
		
	}

}
