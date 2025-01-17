package streams_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LastElement {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby","C",".net");
		
		Optional<String> lastElements = strings.stream().reduce((first, second)-> second);
		
		System.out.println("Last elements: "+ lastElements);
	}
}
