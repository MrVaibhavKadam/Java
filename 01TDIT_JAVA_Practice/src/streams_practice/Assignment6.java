package streams_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment6 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,7);
		List<Integer> list2 = Arrays.asList(3,4,5,6,7);
		List<Integer> list3 = Arrays.asList(3,4,5,7,9,8);
		
		List<Integer> commonIntegers = list1.stream().filter(list2::contains).filter(list3::contains).collect(Collectors.toList());
		System.out.println("Common Elements: "+commonIntegers);
		
		List<Integer> list4 = new ArrayList<>(list1);
		list4.retainAll(list2);
		list4.retainAll(list3);
		
		System.out.println("Second way:"+ list4);
		

	}

}
