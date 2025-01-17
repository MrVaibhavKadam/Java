package streams_practice;

import java.util.Arrays;
import java.util.List;

public class IntegerList {
//printing the number in list in stream in two different ways.
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		
		list.stream().map(e -> e*2).forEach(System.out::println);
		
		
		System.out.println("Without using map:");
		list.stream().forEach(a -> System.out.print(a*2+ " "));

	}

}
