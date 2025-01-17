package methods;

import java.util.Scanner;

public class CountVowles {
	
	public static int vowel_count(String str) {
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)== 'u' ) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		int num = vowel_count(str);
		
		System.out.println(num);
		sc.close();
	}

}
