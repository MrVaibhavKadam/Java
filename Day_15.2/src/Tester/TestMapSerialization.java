package Tester;
import static com.app.core.Subject.AWP;

import static java.time.LocalDate.parse;
import static utils.BinIOUtils.restoreStudentDetails;
import static utils.BinIOUtils.saveStudentMapDetails;

import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Address;
import com.app.core.Student;
import static utils.CollectionUtils.populateMap;

public class TestMapSerialization {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			String file = sc.nextLine();
			HashMap<Integer, Student> map=populateMap();
			saveStudentMapDetails(map, file);   
			System.out.println("Data Stored...!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Over...");

	}

	

}
