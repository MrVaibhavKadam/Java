package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator2 {

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
		//2. Attach Iterator to display Strings.
		Iterator<String> itr=list.iterator();//iterator is placed before the first element.  
		while(itr.hasNext())
			System.out.print(itr.next());//Iterator's position is after the last element.
		System.out.println(itr.next());//runtime error(jvm):NoSuchelEmentExists
       
		
		
		
		

	}

}
