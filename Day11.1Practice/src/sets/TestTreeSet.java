package sets;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// Demo of TreeSet using different constructors
		// create fixed size list of emps using 1 single stmt.
		List<Emp> emps = Arrays.asList(new Emp(100, "Vaibhav", "CEO", 1500000), 
				new Emp(109, "Vaibhav", "EO", 1500000),
				new Emp(101, "Ram", "Hr", 100000), 
				new Emp(100, "Shyam", "CEO", 110000));
		System.out.println("Printing a list:");
		
		for(Emp e: emps)
			System.out.println(e);
		
		//sort these emps in ascending order of emp id using TreeSet. - Natural Ordering
		TreeSet<Emp> ts1 = new TreeSet<>(emps);
//		for(Emp e: ts1)
//			System.out.println(e);
		//sort these emps in ascending order of salary using TreeSet. - Custom Ordering.
		//for custom ordering use comparator based constructor.(public TreeSet(Comparator<? super E> comparator)).
		//new Comparator<Emp>() = instance of the class which implements Comparator i/f.
		TreeSet<Emp> ts = new TreeSet<>(new Comparator<Emp>() {
			@Override
			public int compare(Emp e1, Emp e2) {
				System.out.println("In compare:Salary based.");
//				if(e1.getSalary()<e2.getSalary())
//					return -1;
//				if (e1.getSalary() == e2.getSalary())
//					return 0;
//				return 1;
				
				return ((Double)e1.getSalary()).compareTo(e2.getSalary());
			}
		});
//		System.out.println(ts);//O/P - empty treeset
		//Populating TreeSet.
		ts.addAll(emps);//anonymous inner class's compare method get called.
		System.out.println("Printing TreeSet again");
		for(Emp e:ts)
			System.out.println(e);
	}

}
