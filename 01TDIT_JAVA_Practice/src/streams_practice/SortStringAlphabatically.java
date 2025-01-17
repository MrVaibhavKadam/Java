package streams_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringAlphabatically {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Banana", "Apple", "Mango", "Grapes", "Cherry", " ");
		
		List<String> nameStrings = Arrays.asList("vaibhav", "Angad", "Digvijay","Rudransh","Vighanesh");
		
		List<String> sortedFruits = fruits.stream().sorted().collect(Collectors.toList());
		System.out.println("List of the sorted fruits: "+sortedFruits);
		//Case sensitive Order
		List<String> sortedNames = nameStrings.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
		System.out.println("Sorted names case sensitive:"+sortedNames);
		
	}

}
