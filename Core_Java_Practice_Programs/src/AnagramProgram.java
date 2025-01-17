import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String s1 = sc.nextLine();
		System.out.println("Enter Second String: ");
		String s2 = sc.nextLine();
		
		String s1Copy = s1.replaceAll("\\s", "");
		String s2Copy = s2.replaceAll("\\s", "");
		boolean isAnagram = true;
		
		if (s1Copy.length() != s2Copy.length()) {
			isAnagram = false;
		}
		else {
			char[] arrays1 = s1Copy.toLowerCase().toCharArray();
			char[] arrays2 = s2Copy.toLowerCase().toCharArray();
			
			Arrays.sort(arrays1);
			Arrays.sort(arrays2);
			
			isAnagram = Arrays.equals(arrays1, arrays2);
		}
		if (isAnagram) {
			System.out.println(s1 + " And " + s2 +" are anagrams");
		}else {
			System.out.println(s1 + " And " + s2 +" are NOT anagrams");
		}
		
	}
}
