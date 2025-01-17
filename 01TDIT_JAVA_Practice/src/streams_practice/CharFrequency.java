package streams_practice;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter The input String:");
		String input = sc.nextLine();
		
		Map<Character, Long> charFrequency1 = input.chars().filter(c -> c!=' ')//optional: Ignore spaces.
													.mapToObj(c -> (char)c)
													.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		charFrequency1.forEach((character, frequency)-> System.out.println("'"+ character+ "' -> "+ frequency));											
	}
}
