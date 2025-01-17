package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator6 {

	public static void main(String[] args) {
		//1. create a array list of Strings n populate it.
		ArrayList<String> list=new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("asdf");
		list.add("lkjhkjuh");
		list.add("man");
		list.add("4528");
		list.add("784");
		list.add("abc123");
		System.out.println("Printing list content via iterator.");
		
		for(String s:list)//for-each:Implicitly call Iterator:ConcurrentModificationExceotion-Rerror
			if(s.length()>5)
				list.remove(s);//Structural modification:But error:Reason:we are doing modification using list's Methods.
		
		
       
		
		
		
		

	}

}
