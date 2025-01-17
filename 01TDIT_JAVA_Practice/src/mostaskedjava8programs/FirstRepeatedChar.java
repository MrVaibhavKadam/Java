package mostaskedjava8programs;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

//8. Given a String, find the first repeated character in it using Stream functions?
public class FirstRepeatedChar {

	public static void main(String[] args) {
		
		String input = "Java is very popular language.";
		
		Character resultCharacter = input.chars().mapToObj(c -> Character.toLowerCase(Character.valueOf((char)c)))
										 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
										 .entrySet().stream()
										 .filter(entry -> entry.getValue() > 1L)
										 .map(entry -> entry.getKey())
										 .findFirst().get();
		System.out.println(resultCharacter);
		//OR
		Set<Character> seenCharacters = new HashSet<>();
		Character result = input.chars().mapToObj(c -> (char)c).filter(c -> !seenCharacters.add(c)).findFirst().orElse(null);

	}

}
