package streams_practice;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String number = scanner.nextLine();
		
		int sum = number.chars()
				.map(Character :: getNumericValue).sum();
		
		System.out.println("Sum of Digits is: "+ sum);
		
		scanner.close();

	}

}
