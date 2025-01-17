package mostaskedjava8programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicateorNot {
	public boolean containsDuplicate(int[] nums) {
	    Set<Integer> set = new HashSet<>();
	    for (int num : nums) {
	        if (!set.add(num)) {
	            return true; // Duplicate found
	        }
	    }
	    return false; // No duplicates
	}
	public static void main(String[] args) {
		
		ContainsDuplicateorNot cd = new ContainsDuplicateorNot();
		int[] nums = {5,3,6,4,5,6,2,8,2,1,9};
		System.out.println("Contains Duplicate: "+cd.containsDuplicate(nums));
		
//		List<Integer> list = Arrays.stream(nums)
//                .boxed()
//                .collect(Collectors.toList());
//		Set<Integer> set = new HashSet<>(list);
//		if(set.size() == list.size()) {
//			return;
//		} 
//		    return;



	}

}
