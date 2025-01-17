package methods;

import java.util.Scanner;

public class CountWords {
	
	public static int countWords(String str) {
		//You can use this logic instead of if stmt.
//		 // Trim leading and trailing spaces from the string
//        str = str.trim();
//        
//        // If the string is empty after trimming, return 0
//        if (str.isEmpty()) {
//            return 0;
//        }
		int count = 0;
		//First -> This line checks whether the string starts or ends with a spaces
		if(!(" ".equals(str.substring(0, 1))) && !(" ".equals(str.substring(str.length() - 1)))) {
			
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					count++;
				}
			}
			
		}
		return count = count + 1;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The string");
		String str = sc.nextLine();
		
		int nos = countWords(str);
		System.out.println(nos);
		sc.close();
	}
}
