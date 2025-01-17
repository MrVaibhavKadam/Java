package exc;
import java.util.Scanner;

import static utils.ValidationUtils.validateSpeed;;

public class Tester {
	public static void main (String args[]) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter current speed");
			validateSpeed(sc.nextInt());
			
		}catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main continue..!");
	}

}
