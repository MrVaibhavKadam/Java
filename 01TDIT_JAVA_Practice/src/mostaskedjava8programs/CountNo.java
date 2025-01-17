package mostaskedjava8programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//5. Given a list of integers, find the total number of elements present in the list using Stream functions?
public class CountNo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,9,1);
		
		long count = list.stream().count();
		System.out.println(count);
		
		//OR
		//Arrays.stream(arr).boxed().count();

	}

}
