package streams_practice;

import java.util.ArrayList;
import java.util.List;

public class SortOperations {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
        
		names.add("David");
		         
		names.add("Johnson");
		         
		names.add("Samontika");
		         
		names.add("Brijesh");
		         
		names.add("John");
		//natural sorting
		names.stream().sorted().forEach(System.out::println);
		//custome sorting
		names.stream().sorted((String name1, String name2) -> name1.length() - name2.length()).forEach(System.out::println);

	}

}
