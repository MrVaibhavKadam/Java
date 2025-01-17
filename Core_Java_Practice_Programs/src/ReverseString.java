import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String string = "Reversed";
		
		StringBuilder string2 = new StringBuilder();
		string2.append(string);
		string2 = string2.reverse();
		
		System.out.println(string2);
		
		//without using string inbuild reverse()
		char [] str = string.toCharArray();
		for(int i =str.length-1; i >= 0; i--)
			System.out.print(str[i]);
		//3rd Way
		    String str1;
	        @SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
	        System.out.println("Enter your String");
	        str1 = in.nextLine();
	        String[] str3 = str1.split("");    //used split method to print in reverse order
	        for(int i=str3.length-1; i>=0; i--)
	        {
	            System.out.print(str3[i] + "");
	        }
		
	}

}
