
public class ArmstronNumber {
	
	static void armstrongNumber(int num) {
		int copyOfNum = num;
		
		int numberOfDigits = String.valueOf(num).length();
		
		int sum = 0;
		
		while(copyOfNum != 0) {
			
			int lastDigit = copyOfNum%10;
			
			int lastDigitResult = 1;
			
			 //sum += Math.pow(lastDigit, numberOfDigits);
			 
			 //System.out.println("Sum is: "+sum);
			
			for(int i = 0; i < numberOfDigits; i++) {
				
				lastDigitResult = lastDigitResult * lastDigit;
			}	
			sum = sum + lastDigitResult;
			
			copyOfNum = copyOfNum/10;//removing last element.
		}
		
		if(sum == num)
			System.out.println("Given number is Armstrong Number.");
		else 
			System.out.println("Given number is not Armstromng Number.");	
	}

	public static void main(String[] args) {
		armstrongNumber(153);
		armstrongNumber(254);

	}

}
