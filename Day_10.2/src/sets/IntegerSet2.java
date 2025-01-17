package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
//import java.util.Arrays;
import java.util.List;

public class IntegerSet2 {
	public static void main(String[] args) {
		//set a empty Hashset and populate it with ints
		//public HashSet(Collection<? extends E>c)
		List<Integer> ints=Arrays.asList(1,2,3,56,63,12,2,1,23,30);
		
		HashSet<Integer> hs=new HashSet<>(ints);
		System.out.println("Hs befor " +hs);
		//search for element
		System.out.println(hs.contains(56)?"Present":"Absent");
		//remove the element
		System.out.println("Removed "+hs.remove(2));
		System.out.println("HS again "+hs);
		
		
		
	}

}
