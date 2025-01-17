package arraylists_exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareTwoArrayList {

	public static void main(String[] args) {
		 // Create two ArrayLists
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Elderberry"));

        // Check if the two lists are equal
        if (list1.equals(list2)) {
            System.out.println("The two lists are equal.");
        } else {
            System.out.println("The two lists are not equal.");
        }

        // Find common elements
        ArrayList<String> commonElements = new ArrayList<>(list1);
        commonElements.retainAll(list2);
        System.out.println("Common elements: " + commonElements);

        // Find elements unique to list1
        ArrayList<String> uniqueToList1 = new ArrayList<>(list1);
        uniqueToList1.removeAll(list2);
        System.out.println("Elements unique to list1: " + uniqueToList1);

        // Find elements unique to list2
        ArrayList<String> uniqueToList2 = new ArrayList<>(list2);
        uniqueToList2.removeAll(list1);
        System.out.println("Elements unique to list2: " + uniqueToList2);

	}

}
