package mostaskedjava8programs;
//6. Given a list of integers, find the maximum value element present in it using Stream functions?
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class FindMinMax {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,25,42,32,63,21);
		
		OptionalInt maxNumInt = numbers.stream().mapToInt(Integer::intValue).max();
		
		OptionalInt minNumInt = numbers.stream().mapToInt(Integer::intValue).min();
		
		//OR
		System.out.println("Second Way:");
		int max = numbers.stream().max(Integer::compare).get();
		int min = numbers.stream().min(Integer::compare).get();
		System.out.println("MaxValue:"+ max);
		System.out.println("MaxValue:"+ max);
		
		int [] arr = {12,25,42,32,63,21};
		int maxdata = Arrays.stream(arr).boxed()
                .max(Comparator.naturalOrder()).get();
		System.out.println("MaximumNum: "+ maxdata);

	}

}
