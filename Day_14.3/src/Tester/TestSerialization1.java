package Tester;
import static com.app.core.Subject.AWP;
import static java.time.LocalDate.parse;
import static utils.BinIOUtils.restoreStudentDetails;
import static utils.BinIOUtils.saveStudentDetails;

import java.util.Scanner;

import com.app.core.Address;
import com.app.core.Student;

public class TestSerialization1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			String file = sc.nextLine();
			Student s = new Student(10, "ravi", parse("1990-12-13"), AWP, 7.5);
			s.assignAddress(new Address("pune", "MH", "2546225455"));
			saveStudentDetails(s, file);
			System.out.println("Data Stored...!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Over...");

	}

	

}
