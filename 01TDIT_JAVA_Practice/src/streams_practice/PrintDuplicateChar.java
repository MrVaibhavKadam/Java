package streams_practice;

import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicateChar {

	public static void main(String[] args) {
		
		String input = "Messissippii";
		
		input.chars()//IntStream
			 .mapToObj(c -> (char) c)//
			 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			 .entrySet().stream().filter(entry-> entry.getValue()>1);	

	}

}
