package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import com.app.core.Emp;

public class TestTreeSet {

	public static void main(String[] args) {
		//Demo of tree set using different constr.
		//create fixed size of the list of emps using single stmt.
		List<Emp> emps= Arrays.asList(new Emp(100,"Vaibhav","CEO",1500000),
				new Emp(109,"Ram","RnD",15000),
				new Emp(29,"Shyam","Hr",52456),
				new Emp(85,"Deepak","MKT",150000),
				new Emp(78,"Radhe","FINANCE",154000)
				
				);
		System.out.println("Print the list using for-each");
		for(Emp e:emps)
			System.out.println(e);
		
		//sort thest emps in ascending order of empid using a treeset using:Natural Ordering.
		TreeSet<Emp> ts1=new TreeSet<>(emps);//while populating TS:Emp's compareTo() Method is invoked.
		System.out.println("Printing the tree set using Natural Ordering");
		for(Emp e:ts1)
			System.out.println(e);
		
	}
}
