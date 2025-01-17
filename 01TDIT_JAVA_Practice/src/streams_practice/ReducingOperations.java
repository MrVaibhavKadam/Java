package streams_practice;

import java.util.Arrays;
import java.util.OptionalInt;

public class ReducingOperations {

	public static void main(String[] args) {
		int sum = Arrays.stream(new int[] {9,13,6,4,7,6,9}).reduce(0, (a, b)-> a+b);
		System.out.println(sum);
		
		OptionalInt sum1 = Arrays.stream(new int [] {9,13,6,4,7,6,9}).reduce((a,b)-> a-b);
		System.out.println(sum1);
		
		OptionalInt min = Arrays.stream(new int[] {1,2,3,6,5,4,9,8,7}).min();
		System.out.println(min);
	}

}
