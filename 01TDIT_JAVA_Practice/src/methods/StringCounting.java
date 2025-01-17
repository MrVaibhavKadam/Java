package methods;

import java.util.Scanner;

public class StringCounting {
	
	public static String middle(String str) {
		int position;
		int length;
		
		if (str.length()%2 == 0) {
			position = str.length()/2 -1;
			length = 2;
		} else {
			position = str.length()/2;
			length = 1;
		}
		return str.substring(position, position+length);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String mid = middle(str);
		System.out.println(mid);
		sc.close();
		
		

	}

}
