package streams_practice;

import java.util.ArrayList;
import java.util.List;

public class Stream_Mapping {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
        
		names.add("David");
		         
		names.add("Johnson");
		         
		names.add("Samontika");
		         
		names.add("Brijesh");
		         
		names.add("John");
		
		names.stream().map(String::length).forEach(System.out::println);
		int sum = names.stream().mapToInt(String::length).sum();
		System.out.println("Total mo of words: "+sum);
	}

}
