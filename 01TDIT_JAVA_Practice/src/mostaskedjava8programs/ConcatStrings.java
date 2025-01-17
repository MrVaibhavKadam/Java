package mostaskedjava8programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatStrings {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("He","is");
		List<String> list2 = Arrays.asList("Good", "Student");
		
		Stream<String> concaStream = Stream.concat(list1.stream(), list2.stream());
		
		concaStream.forEach(str -> System.out.print(str + " "));

	}

}
