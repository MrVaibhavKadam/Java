package string;

public class Test1 {

	public static void main(String[] args) {
		 String s1="hello";
		 s1=s1.concat("hi");
		// System.out.println(s1);/hellohi
		 String s2=s1.toUpperCase();
		 System.out.println(s2);
		 String s3=s2.replace('L','T');
		 System.out.println(s3);
	}		
}
	
