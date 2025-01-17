package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator4 {

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
		list.add("abcdefg");//Structural modification after attaching the iterator.
		System.out.println("List content via iterator");
		while(itr.hasNext())
			System.out.print(itr.next());//ConcurrentModificationException:reason Fail-fast behaviour of iterator anf Listitr.
		
		
       
		
		
		
		

	}

}
