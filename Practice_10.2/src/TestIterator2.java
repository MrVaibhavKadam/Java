import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator2 {

	public static void main(String[] args) {
		// 1. Create arraylist.
		ArrayList<String> list = new ArrayList<>();

		list.add("one");
		list.add("sfdgrd");
		list.add("two");
		list.add("three");
		list.add("four1234");
		list.add("78546");
		list.add("9865pq2");
		list.add("cased745");

		// 2.Attach iterator to display list.
		System.out.println("List content Via Iterator:");
		Iterator<String> itr = list.iterator();// Iterator is placed before the first element.
		//list.add(0, "abcdfg");//structural modification: YES
		//when we try to modify list after attaching the iterator it will give us an error name  java.util.ConcurrentModificationException
		//list.add("fgrfdfsd");//append
		//list.remove(list.size());//indexoutofboundexception
		//list.remove(list.size()-1);//error:list.remove(list.size());
		list.set(0, "2548675");//NoError: bcoz we are not modifying the structure of the list.We are just replaceing the 0th element with our string.
		

		while (itr.hasNext())
			System.out.println(itr.next() + " ");//Error: java.util.ConcurrentModificationException
	}
}
