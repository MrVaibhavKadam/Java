package streams_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestInt {

	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(10, 20, 35, 50, 50, 75, 65);
		 
		 Optional<Integer> secondLargestNum = numbers.stream().distinct()
				 								.sorted(Comparator.reverseOrder())
				 								.skip(1)
				 								.findFirst();
		 
		 
		 
		 if (secondLargestNum.isPresent()) {
			System.out.println("Second largest number is: "+ secondLargestNum);
		} else {
			System.out.println("The list does not have unique elements.");
		}

	}

}
