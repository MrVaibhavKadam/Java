package mostaskedjava8programs;
//3. How to find duplicate elements in a given integers list in java using Stream functions?
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,34,35,43,34,1,12);
		Set<Integer> setL = new HashSet<>(); 
		list.stream().filter(n -> !setL.add(n)).forEach(System.out::println);
		//Print unique elements
		Set<Integer> set1 = new HashSet<>(list);
		
		List<Integer> list2 = set1.stream().collect(Collectors.toList());
		System.out.println("Unique Elements:"+list2);
		
		//other way
		System.out.println("Printing Using distinct():");
		list.stream().distinct().forEach(n -> System.out.println(n));
		
		//List<Integer> list = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
		

	}

}
