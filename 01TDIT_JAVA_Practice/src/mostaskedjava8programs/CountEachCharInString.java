package mostaskedjava8programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharInString {

	public static void main(String[] args) {
		
		String string = "My name is JAVA java is good";
		
		Map<String, Long> frequencyMap = Arrays.stream(string.split(" ")).map(String::toLowerCase)
											   .collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()));
		System.out.println(frequencyMap);
		
		Map<Character, Long> frequencyMap1 = string.chars().filter(c -> c != ' ').mapToObj(c -> (char)c).map(Character::toLowerCase).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(frequencyMap1);
	}

}
