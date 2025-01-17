package streams_practice;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String inputString = sc.nextLine();
		
		String resultString = Stream.of(inputString.split(" "))
				.map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		String reversedString = new StringBuilder(inputString).reverse().toString();//entire string is reversed.
		
		System.out.println("Reverse of the string is: "+resultString);
		System.out.println("reversed String 2: "+reversedString);
		
		sc.close();
	}
}
