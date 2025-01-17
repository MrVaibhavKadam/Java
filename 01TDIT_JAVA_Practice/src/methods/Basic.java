package methods;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		System.out.println("Enter third number");
		int num3 = sc.nextInt();
		
		System.out.println("Enter fourth number");
		int num4 = sc.nextInt();
		
		if (num1 == num2 && num2 == num3 && num3 == num4) {
			System.out.println("Numbers are same..!");
		} else {
			System.out.println("Numbers are Different..!");
		}
		
		sc.close();
	}

}
