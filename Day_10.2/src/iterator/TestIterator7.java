package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestIterator7 {

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
		//Display the element in reverse order:Last---First.
		// is it possible to solve it using Iterator?:NO:hasNext() & next()methods only.Only forward mtds.
		//Soln:use ListIterator.
		ListIterator<String>litr=list.listIterator(list.size());
		System.out.println("Print the element in reverse mannar ");
		while(litr.hasPrevious())
			System.out.println(litr.previous());
		
       
		
		
		
		

	}

}
