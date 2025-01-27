package tester;

import static com.app.core.Subject.valueOf;
import static java.time.LocalDate.parse;import java.security.PKCS12Attribute;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.StudentHandlingException;
import com.app.core.Subject;

public class StudentManagement {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)){
			//get populated map from utils.
			HashMap<Integer, Student> map = new HashMap<>();
			
			boolean exits = false;
			
			while (!exits) {
				System.out.println("Menu -> 1.Admit Student. 2.Cancle Addmission 3.Display Names. 4.Display the names of students age > 22 & enrolled in specific subject"
						+ "5.Change GPA 6.Exit");
				System.out.println("Choose Option: ");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter Student Details: rollNo, name, DOB, currentSubject, gpa");
						int rollNo = sc.nextInt();
						if (map.containsKey(rollNo)) {
							throw new StudentHandlingException("Duplicate Roll Number.");
						}
						map.put(rollNo, new Student(sc.nextInt(), sc.next(),parse(sc.next()) ,
								valueOf(sc.next().toUpperCase()), sc.nextDouble()));
						System.out.println("Addmission Successful..!");
						break;
						
					case 2:
						System.out.println("Enter rollNo to cancle addmission.");
						Student s = map.remove(sc.nextInt());
						
						if (s == null)
							throw new StudentHandlingException("Invalid RollNo..!");
						System.out.println(s.getName() + "addmission get cancled.");				
						break;
						
					case 3:
						System.out.println("Enter current Subject:");
						//Converting string --> enum
						Subject currentSubject1 = valueOf(sc.next().toUpperCase());
						for(Student s1 : map.values())
							if(s1.getCurrentSubject().equals(currentSubject1))
								System.out.println("Names are: "+ s1.getName());
						//OR
						map.values().stream()//stream<Students>
						.filter(s1->s1.getCurrentSubject().equals(currentSubject1))
						.forEach(s1 -> System.out.println(s1.getName()) );
						break;
						
					case 4:
						System.out.println("Enter current subject");
						
						break;
						
					case 5:
	
						break;
						
					case 6:
						exits = true;
						break;	
					}
					
				} catch (Exception e) {
					System.out.println("Error: " + e);
					System.out.println("Please try again..!");
				}
				sc.nextLine();
				
			}
			
		}

	}

}
