package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class IntegerSet {

	public static void main(String[] args) {
		// create empty HashSet and populate it with ints
		// public HashSet(Collection <? extends E> c): Method
		List<Integer> ints = Arrays.asList(5, 6, 3, 46, 52, 46, 25, 85);//Fixed size list
		//ints.add(25);//Error:java.lang.UnsupportedOperationException: bcoz we are trying to change the size of the fixed size list.
		System.out.println("List of ints" + ints);
		HashSet<Integer> hSet = new HashSet<>(ints);
		System.out.println("HashSet" + hSet);
		
		System.out.println("HS via Iterator");
		Iterator<Integer> itr = hSet.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+ " ");
		//Display element Via for each
		System.out.println("\nHS via for-each");
		for(int i:hSet)
			System.out.print(i+" ");
		
		
		
	}

}
