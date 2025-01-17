package Tester;

import java.time.LocalDate;
import static java.time.LocalDate.parse;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Student;
import static com.app.core.Subject.*;
import com.app.core.StudenthandlingException;
import com.app.core.Subject;

import utils.IOUtils;
import static utils.IOUtils.saveStudentDetails;
import static utils.CollectionUtils.populateMap;

public class StudentManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// Get populated map from the utils.
			HashMap<Integer, Student> map = populateMap();
			boolean exit = false;
			while (!exit) {

				System.out.println("Menu 1.Admit Student 2.Cancle Admission "
						+ "3.Display names of all students enrolled in specific subject"
						+ "I/P subject 4.Display names of all student with age>22 & enrolled in specific subject."
						+ "5.change GPA 6.Exit");
				System.out.println("Choose the option ");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter student details rollNo, name,dob, currentSubject, gpa");
						int rollNo=sc.nextInt();
						if(map.containsKey(rollNo))
							throw new StudenthandlingException("Duplicate rollNo ");
						map.put(rollNo,new Student(rollNo, sc.next(), parse(sc.next()),
								valueOf(sc.next().toUpperCase()), sc.nextDouble()));
						System.out.println("Student admission Successful");

						break;
					case 2:System.out.println("Enter Rollno to cancle Admission");
					Student s=map.remove(sc.nextInt());
					if(s==null)
						throw new StudenthandlingException("Invalid RollNo..!");
					System.out.println("Admission Cancled..!"+s.getName());

						break;
					case 3:System.out.println("Enter Current Subject");
					//Converting String-->enum
					Subject curntSubject=valueOf(sc.next().toUpperCase());
					//Searching by value based so convert map into collection
					System.out.println("Name of student with sub "+curntSubject);
					
					for(Student s1:map.values())
						if(s1.getCurrentSubject().equals(curntSubject))
							System.out.println(s1.getName());
					//OR all above code in functional programming manner.
					map.values().stream()//Stream of <student>
					.filter(s1->s1.getCurrentSubject().equals(curntSubject))
					.forEach(s1->System.out.println(s1.getName()));
						

						break;
					case 4:
						curntSubject=valueOf(sc.next().toUpperCase());
						//Searching by value based so convert map into collection
						System.out.println("Name of student with sub"+curntSubject+" n age>22 ");
						for(Student s1:map.values())
							if(s1.getCurrentSubject().equals(curntSubject)&&s1.computeAge()>22)
								System.out.println(s1.getName());
						map.values().stream()//Stream of <student>
						.filter(s1->s1.getCurrentSubject().equals(curntSubject))
						.filter(s1->s1.computeAge()>22)
						.forEach(s1->System.out.println(s1.getName()));
							

						break;
					case 5:System.out.println("Enter rollNo n dob to update GPA");
					s=map.get(sc.nextInt());
					if(s==null)
						throw new StudenthandlingException("Invalid Roll No..!");
					LocalDate dob=parse(sc.next());//Accepting dob from user
					if(s.getDob().equals(dob))
					{
						System.out.println("Enter new GPA");
						s.setGpa(sc.nextDouble());
					}else
						throw new StudenthandlingException("Invalid DOB");

						break;
					case 6:
						
						exit=true;
						//tester has to call Ioutil's save method for saving student details
						System.out.println("Enter file name to save details");
					//	IOUtils.saveStudentDetails(map, sc.nextLine());//
						saveStudentDetails(map, sc.next());//Import static-no need of writing IOUtils.

						break;

					}
				} catch (Exception e) {
					System.out.println("Error " + e);
					System.out.println("Please retry..!");
				}
				sc.nextLine();// To read pending tokens from the sc's buffer.
			}

		}

	}

}
