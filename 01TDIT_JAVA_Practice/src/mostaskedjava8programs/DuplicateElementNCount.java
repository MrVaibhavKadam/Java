package mostaskedjava8programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//19. How to find only duplicate elements with its count from the String ArrayList in Java8?
public class DuplicateElementNCount {

	public static void main(String[] args) {
		List<String> nameStrings = Arrays.asList("aa", "bb","cc","bb");
		
		Map<String, Long> nameCount = nameStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Set<Entry<String, Long>> entrySet = nameCount.entrySet();
		for (Entry<String, Long> entry : entrySet) {
			if(entry.getValue() > 1)
				System.out.println(entry.getKey() + " : " + entry.getValue() );						
		}
		
		Map<String, Long> nameCount1 = nameStrings.stream().filter(s -> Collections.frequency(nameStrings, s)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Count: "+nameCount1);
		
		System.out.println(nameCount);
		
		Map<String, Long> namesCount2 = nameStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
 
	}

}
