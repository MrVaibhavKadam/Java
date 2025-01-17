package mostaskedjava8programs;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//7. Given a String, find the first non-repeated character in it using Stream functions?
public class NonRepeatedChar {

	public static void main(String[] args) {
		
		String input = "Java is very popular language.";
//		Character chars = input.chars().mapToObj(c -> (char) c).filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch)).findFirst().orElse(null);
//		System.out.println(chars);
		
		//OR
		Character resultCharacter = input.chars().mapToObj(c -> Character.toLowerCase(Character.valueOf((char) c)))
										 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
										 .entrySet().stream().filter(entry -> entry.getValue() == 1l)
										 .map(entry -> entry.getKey())
										 .findFirst().get();
		System.out.println(resultCharacter);
		
	   

	}

}
