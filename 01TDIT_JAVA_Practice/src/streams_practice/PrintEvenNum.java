package streams_practice;

import java.util.Arrays;
import java.util.List;

public class PrintEvenNum {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.println("Even numbers: ");
		
		numbers.stream().filter(n -> n % 2 == 0)
		.forEach(System.out::println);
		
		
	}
}
