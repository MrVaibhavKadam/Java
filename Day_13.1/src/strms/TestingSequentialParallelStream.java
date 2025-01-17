package strms;

import java.util.Arrays;
import java.util.List;

public class TestingSequentialParallelStream {

	public static void main(String[] args) {
		List<Integer> ints=Arrays.asList(12,15,85,46,25,-11,36,99);
		System.out.println("Sequential processing of streams");
		//Display elements using forEach
		ints.stream()//Stream of Integer:ref type :seq stream
		.forEach(i->System.out.print(i+" "));
		
		System.out.println("Parallel processing");
		ints.parallelStream()//Stream of Integer:ref type :parallel stream
        .forEach(i->System.out.print(i+" "));
	}

}
