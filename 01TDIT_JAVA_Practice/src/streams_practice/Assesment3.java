package streams_practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Assesment3 {

	public static void main(String[] args) {
		List<Employee> listEmp = new ArrayList<>();
		
		listEmp.add(new Employee("A", 125600));
		listEmp.add(new Employee("S", 658746));
		listEmp.add(new Employee("M", 321544));
		listEmp.add(new Employee("I", 986547));
		
		//System.out.println("Original list:");
		
		List<Employee> sortedList = listEmp.stream().sorted(Comparator.comparing(Employee::getEmpName)).collect(Collectors.toList());
		System.out.println("First Way"+sortedList);
		
		List<Employee> sortedList2 = listEmp.stream().sorted(Comparator.comparing(Employee::getEmpName).thenComparing(Employee::getSalary)).collect(Collectors.toList());
		System.out.println("Second way"+ sortedList2);
   
	}

}
