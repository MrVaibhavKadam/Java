package methods;

import java.util.Scanner;

public class DigitSum {
	public static int  sumDigit(long n) {
		int result = 0;
		
		while(n > 0) {
			result += n%10;//Adds the last digit of n to the result.
			
			n/=10; //Remove the last digit
		}
		return result;
	}
	
	public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.print("Input an integer: ");
      int digits = in.nextInt();
	  System.out.println("The sum is " + sumDigit(digits));
	  
	  in.close();
    }
	

}
