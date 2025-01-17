package sets;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import com.app.core.Emp;

public class TestTreeSet2 {

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
		
		//sort thest emps in ascending order of Salary using a treeset using:Custom Ordering.
		//Use public TreeSet(Comparator<? super E>comparator).
		
		TreeSet<Emp> ts=new TreeSet<>(new Comparator<Emp>() {
			@Override
			public int compare(Emp e1,Emp e2) {
//				if(e1.getSalary()<e2.getSalary())
//					return -1;
//				if(e1.getSalary()==e2.getSalary())
//					return 0;
//				return 1;
				return ((Double)e1.getSalary()).compareTo(e2.getSalary());
			}
		});
		System.out.println("Printing TS");
		System.out.println(ts);//empty treeset:
		//populating treeset
		ts.addAll(emps);
		System.out.println("Printng TS again");
		for(Emp e:ts)
			System.out.println(e);
		
	}
}
