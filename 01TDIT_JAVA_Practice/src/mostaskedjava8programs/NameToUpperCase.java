package mostaskedjava8programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameToUpperCase {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("vaibhav", "Rohit", "Omkar", "Angad");
		
		List<String> listUpperCase = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(listUpperCase);

	}

}
