package Tester;
import static utils.BinIOUtils.restoreStudentDetails;

import java.io.IOException;
import java.util.Scanner;
public class TestDeserializationMap {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter bin file name");
			Object o=restoreStudentDetails(sc.nextLine());
			System.out.println(o);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
