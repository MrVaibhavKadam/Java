package Test_equals;

public class Test1 {

	public static void main(String[] args) {
		Car c1=new Car(12345,"red",50000);
		Car c2=new Car(12345,"red",50000);
		Car c3=c1;
		System.out.println(c1.equals(c2));//false(Calls object class equals method bcoz we didn't override equals method in car class)
		System.out.println(c1==c2);//false:ref eauality
		System.out.println(c1.equals(c3));//true
		System.out.println(c1==c3);//true
		System.out.println(c1.hashCode()+" "+c2.hashCode()+" "+c3.hashCode());
		//five methods heart of core java are 1.hashcode 2.equals 3.toString 4.compare 5.compareT.
		
		
	}

}
