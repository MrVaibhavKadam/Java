package strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestSDF {

	public static void main(String[] args) {
		//creating instance of SDF
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the DOB of User1:yr-MM-dd");
			Date dob1=sdf.parse(sc.next());//Parse invokes the string as per the pattern and it is going to convert it into date class instance. 
			System.out.println(dob1);
			System.out.println(sdf.format(dob1));
			System.out.println("Enter the DOB of User2:yr-MM-dd");
			Date dob2=sdf.parse(sc.next());
			System.out.println("Compare To "+dob1.compareTo(dob2));
			
		}catch(ParseException e) {
			e.printStackTrace();
			
		}
		System.out.println("Main over...");
		
	}

}
