package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

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
			System.out.print(itr.next()+" ");
		//Remove the String from the list having length>5.
		//The current position of the iterator is shifted to after the last element.
		//so for removing element we have to again  attach iterator before first element.For that write again"itr=list.iterator()"
		System.out.println("Trying to remove Element.");
		//re attach iterator
		itr=list.iterator();//Iterator is placed before the first element.
		while(itr.hasNext()) {
			//itr.remove();//Runtime error:IllegalStateExpression:Reason-next() has to be called prior to remove. 
			//itr.next();
			//itr.remove(); here is no runtime error.
			if(itr.next().length()>5)
				itr.remove();//remove all the elements whose length id greater than 5.
			
			
		}
		System.out.println("Filtered list"+list);
		

	}

}
