package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class TestLinkedDHashSet {

public static void main(String[] args) {
		
		List<Double> list=Arrays.asList(10.5,25.3,19.32,50.0,46.3);
		System.out.println("List "+list);
		//Popu;late list--->HashSet.
		HashSet<Double> hs=new HashSet<>(list);//javac checks:List is a collection AND generic type of list or its sub type.
		System.out.println("HashSet "+hs);
		//Populate list--->LinkedhashSet.
		LinkedHashSet<Double> lhs=new LinkedHashSet<>(list);
		System.out.println("LHS "+lhs);//Ordered Set.
		
	}

}
