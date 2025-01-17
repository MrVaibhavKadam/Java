package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
//import java.util.Arrays;
import java.util.List;

public class IntegerSet {
	public static void main(String[] args) {
		//set a empty Hashset and populate it with ints
		//public HashSet(Collection<? extends E>c)
		List<Integer> ints=Arrays.asList(1,2,3,56,63,12,2,1,23,30);
		//ints.add(123);//Run time error:UnsupportedOperationException
		HashSet<Integer> hs=new HashSet<>(ints);
		hs.add(256);
		System.out.println("Hs via toString "+hs);
		Iterator<Integer> itr=hs.iterator();
		//hs.remove(2);//Run time error:java.util.ConcurrentModificationException
		System.out.println("HS via Iterator" );
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		//Display elements of HS via for-each
		System.out.println("\n HS via for-each ");
		for(int i:hs)
			System.out.print(i+" "); 
			
		
		
	}

}
