import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIterator {
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
		
		//Display the list in reverse order.
		//You cant use the iterator u have to use the ListIterator.
		ListIterator<String> ltr = list.listIterator(list.size());//ltr iterator is placed after the last element.
		System.out.println("Printing the list in reverse order:");
		while(ltr.hasPrevious())
			System.out.println(ltr.previous());
	}
}
