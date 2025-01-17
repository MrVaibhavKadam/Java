package test_equals;

public class Test1 {
	public static void main(String[] args) {
		Car c1 = new Car(1234, "red", 9458799);
		Car c2 = new Car(1234, "red", 9458799);
		Car c3 = c1;
		
		System.out.println(c1.equals(c2));//false->Ithe seperate instance tayar hotatat two seperate object sathi.
		//Aapan Object class chi equals method override karat nahiye aani object class
		//chi equals method reference varun object equals aahet ka nahi he check karte so thaats why false.
		System.out.println(c1==c2);//false
		
		System.out.println(c1.equals(c3));//true
		System.out.println(c1==c3);//true
	}
}
