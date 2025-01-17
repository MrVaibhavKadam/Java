package streams_practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Assignment7 {

	public static void main(String[] args) {
		
		Map<Integer, String> hMap1 = new HashMap<>();
		hMap1.put(1, "a");
		hMap1.put(2, "b");
		hMap1.put(3, "c");
		hMap1.put(4, "d");
		
		Map<Integer, String> hMap2 = new HashMap<>();
		hMap2.put(1, "f");
		hMap2.put(2, "b");
		hMap2.put(3, "g");
		hMap2.put(4, "d");
		
		Map<Integer, String> hMap3 = new HashMap<>();
		hMap3.put(1, "x");
		hMap3.put(2, "b");
		hMap3.put(3, "z");
		hMap3.put(4, "d");
		
//		Map<Integer, String> commonMap = new LinkedHashMap<>();
//		
//		hMap1.entrySet().stream().filter(hMap2::containsValue).filter(hMap3::containsValue).forEach(System.out::println);
//		commonMap.forEach((key, value) -> System.out.println(value));
		
		 Set<String> commSet = hMap1.values().stream()
		            .filter(hMap2.values()::contains)
		            .filter(hMap3.values()::contains)
		            .collect(Collectors.toSet());
		System.out.println(commSet);
		
		

	}

	

}
