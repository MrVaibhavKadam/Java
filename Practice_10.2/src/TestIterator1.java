import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator1 {

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

		while (itr.hasNext())
			System.out.println(itr.next() + " ");
		// Remove from the list, Strings > length 5.
		// Now the current position of the itr is after the last element.
		// if we trying to remove element while(itr.hasNext()) this gives us false and
		// we can not remove the element.
		// For doing remove operation we have to reAttach iterator(itr).

		// reattach the itr.
		itr = list.iterator();// Iterator is placed before the first element.
		while (itr.hasNext()) {
			// itr.remove();//Runtime error -IllegalStateException-> bcoz next()Has to be
			// called prior to remove().
			if (itr.next().length() > 5)
				itr.remove();// No error.

		}
		System.out.println("List after removing elements." + list);

	}

}
