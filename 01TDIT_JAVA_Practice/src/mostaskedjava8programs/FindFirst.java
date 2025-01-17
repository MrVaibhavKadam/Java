package mostaskedjava8programs;

import java.util.Arrays;
import java.util.List;

//4. Given the list of integers, find the first element of the list using Stream functions?
public class FindFirst {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,2,3,4,5,6,7,8,9,1);
		
		list.stream().findFirst().ifPresent(System.out::println);
		
		//OR
		System.out.println("Second Way:");
		int[] arr = {54,26,89,25,45,75,56};
		Arrays.stream(arr).boxed().findFirst().ifPresent(System.out::println);
		

	}

}
