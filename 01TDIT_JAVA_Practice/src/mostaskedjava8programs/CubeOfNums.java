package mostaskedjava8programs;

import java.util.Arrays;
import java.util.List;

public class CubeOfNums {

	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
		
		integerList.stream().map(n -> n*n*n).filter(n -> n > 50).forEach(System.out::println);
		System.out.println("Second way->");
		integerList.parallelStream().map(n -> n*n*n).filter(n -> n > 50).forEach(System.out::println);

	}

}
