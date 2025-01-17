package streams_practice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class ListMinMax {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,25,42,32,63,21);
		
		OptionalInt maxNum = numbers.stream().mapToInt(Integer :: intValue).max();
		System.out.println("Maximum of the list is: "+ maxNum);
		
		OptionalInt minNum = numbers.stream().mapToInt(Integer :: intValue).min();
		System.out.println("Minimum of the list: "+ minNum);
		
		
		
		 maxNum.ifPresent(max -> System.out.println("Maximum Number: " + max));
	     minNum.ifPresent(min -> System.out.println("Minimum Number: " + min));

	}

}
