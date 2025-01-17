package mostaskedjava8programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		//OR
		int[] nums = {1,2,3,4,5,6,7,8,9};
		Map<Boolean, List<Integer>> listMap = Arrays.stream(nums).boxed().collect(Collectors.partitioningBy(num -> num % 2 == 0));
		
		System.out.println(listMap);

	}

}
