package streams_practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Assesment2 {
//Sort the map by value.
	public static void main(String[] args) {
		
		Map<Integer, String> sMap = new HashMap<>();
		
		sMap.put(1, "Vaibhav");
		sMap.put(22, "Rohit");
		sMap.put(13, "Alex");
		sMap.put(41, "John");
		sMap.put(5, "Sameer");
		sMap.put(16, "Omkar");
		
		System.out.println("Original Map"+sMap);
		
	        
	        Map<Integer, String> sortedMap = new LinkedHashMap<>();
	        sMap.entrySet().stream()
	            .sorted(Map.Entry.comparingByValue())
	            .forEach(System.out::println);
	        
	        
	        sortedMap.forEach((key, value) -> System.out.println(value));
	        
	        System.out.println("Second way:");
	        sMap.values().stream().sorted().forEach(System.out::println);
	
	}

}
