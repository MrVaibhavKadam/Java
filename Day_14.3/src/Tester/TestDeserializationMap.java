package Tester;
import static utils.BinIOUtils.restoreStudentDetails;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Student;
public class TestDeserializationMap {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter bin file name");
			HashMap<Integer, Student> map=restoreStudentDetails(sc.nextLine());
			//Display student details from map
			map.forEach((i,s)->System.out.println(i+":"+s));
			System.out.println(map);
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
