import java.util.Scanner;

public class SumOfAllDigits {
	
	int sum = 0;
	
	int sumOfAllDigits(int inputNumber) {
		if (inputNumber == 0) {
			return sum;
		}else {
			int lastDigit = inputNumber % 10;
			sum = sum + lastDigit;
			inputNumber = inputNumber/10;
			
			sumOfAllDigits(inputNumber);
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		int numCopy = num;
		int sum = 0;
		
		while(numCopy != 0) {
			
			int lastDigit = numCopy % 10;
			sum = sum + lastDigit;
			numCopy = numCopy/10;
		}
		System.out.println("Sum of all digits of given num: " + sum);
		
		SumOfAllDigits sd = new SumOfAllDigits();
		System.out.println("sum of all digits: "+sd.sumOfAllDigits(num));
	}

}
