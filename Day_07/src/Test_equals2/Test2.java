package Test_equals2;

public class Test2 {

	public static void main(String[] args) {
		Object c1=new Car(12345,"red",50000);
		Object c2=new Car(12346,"red",50000);
		Object c3=new Car(12347,"black",50000);
		Object c4=new Car(12345,"red",50000);
		Object c5=new Car(12349,"white",50000);
		System.out.println(c1.equals(c2));//false
		System.out.println(c1.equals(c3));//false
		System.out.println(c1.equals(c4));//false
		System.out.println(c1.equals(c5));//false
		
		
		
	}

}
