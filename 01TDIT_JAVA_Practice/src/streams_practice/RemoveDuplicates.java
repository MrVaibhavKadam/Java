package streams_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,8,6,9);
		
		List<Integer> numList = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("List of Numbers without Duplicates: "+numList);
		
		List<String> nameStrings = Arrays.asList("apple", "Orange", " Banana", "Mango","Cherry", " Banana", "Mango","Cherry");
		
		List<String> fruitsname = nameStrings.stream().distinct().collect(Collectors.toList());
		System.out.println("Fruit names without Duplicates: "+fruitsname);
	}
}
