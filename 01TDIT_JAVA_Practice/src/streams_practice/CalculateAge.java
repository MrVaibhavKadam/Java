package streams_practice;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter your Birth Date (yyyy-dd-MM)");
		String birthDateString = scanner.nextLine();
		
		LocalDate birthDate = LocalDate.parse(birthDateString);
		
		LocalDate currentDate = LocalDate.now();
		
		Period age = Period.between(birthDate, currentDate);
		
		System.out.println("Your age is: "+age.getYears());
		
		scanner.close();

	}

}
