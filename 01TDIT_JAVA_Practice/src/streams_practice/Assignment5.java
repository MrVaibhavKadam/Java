package streams_practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Assignment5 {

	public static void main(String[] args) {
		String input = "hello world"; 

        
        Map<Character, Long> characterCounts = input.chars()
        										.filter(c -> c!=' ')
								                .mapToObj(c -> (char) c) 
								                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); 

        
        System.out.println("Character counts:");
        characterCounts.forEach((character, count) -> System.out.println(character + ":" + count));
        
        
   

	}

}
