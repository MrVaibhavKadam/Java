package streams_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMapStream {

	public static void main(String[] args) {
		
		List<String> nameStrings = Arrays.asList("vaibhav", "Angad", "Digvijay","Rudransh","Vighanesh");
		
//		Map<String, Integer> namesMap1 = nameStrings.stream()
//										.collect(Collectors.toMap(name -> name, name -> name.length()));
		Map<String, Integer> namesMap = nameStrings.stream().collect(Collectors.toMap(name-> name, String::length));
		System.out.println("List of Map");
		
		namesMap.forEach((key, value)-> System.out.println(key + ":" + value));

	}

}
