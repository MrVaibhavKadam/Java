package mostaskedjava8programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEleOrWordAL {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> namesCount = names
                                .stream().sorted((s1,s2)->s2.compareTo(s1))
                                .collect(
                                 Collectors.groupingBy(
                                  Function.identity(), Collectors.counting()));
        System.out.println(namesCount);
  

	}

}
