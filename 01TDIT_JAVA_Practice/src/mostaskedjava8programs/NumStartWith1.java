package mostaskedjava8programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//2. Given a list of integers, find out all the 
//numbers starting with 1 using Stream functions?
public class NumStartWith1 {

	public static void main(String[] args) {
		List<Integer> lList = Arrays.asList(11,15,8,19,25,98,32);
		
		lList.stream().map(s -> s + " ")//(Strings.valueOf(s) / map(Strings::valueOf))convert int to string
			 .filter(s -> s.startsWith("1")).forEach(System.out::println);
		//OR
		int[] list = {11,15,8,19,25,98,32};
		
		List<String> list1 = Arrays.stream(list).boxed().map(String::valueOf).filter(s -> s.startsWith("1")).collect(Collectors.toList());
		System.out.println(list1);
		
	}

}
