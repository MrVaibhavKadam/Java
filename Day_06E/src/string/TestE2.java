package string;

public class TestE2 {
	public static void main(String args[]) {
		String s1= new String("Hello");
		String s2= new String("Hello");
		String s3= new String("hello");
		String s4=s1;
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//false
		System.out.println(s1==s4);//true
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equals(s4));//true
		System.out.println(s1.equalsIgnoreCase(s3));//true.
		
	}

}
