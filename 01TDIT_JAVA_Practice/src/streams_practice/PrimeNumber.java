package streams_practice;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {
	
	public static boolean isPrime(int number) {
		if (number < 1) {
			return false;
		} else {
			return !IntStream.rangeClosed(2, (int) Math.sqrt(number)).anyMatch(i -> number % i == 0);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = sc.nextInt();
		
		boolean isPrime = isPrime(number);
		
		if (isPrime) {
			System.out.println(number + ":Is PRIME Number.");
		} else {
			System.out.println(number + ":Is not PRIME number.");

		}

	}

}
