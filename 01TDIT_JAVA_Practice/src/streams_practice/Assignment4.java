package streams_practice;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class Assignment4 {
	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5,6,7,8,9};
		
		int [] evenNum = Arrays.stream(array).filter(i -> i % 2 == 0).toArray();
		
		System.out.println("Even Numbers:"+ Arrays.toString(evenNum));
		
		int [] sqre = Arrays.stream(evenNum).map(n -> n*n).toArray();
		System.out.println("Square of even numbers: "+Arrays.toString(sqre));
		
		OptionalInt sum = Arrays.stream(sqre).reduce((a,b)-> a+b );
		System.out.println("Sum is:" + sum);
		
		
	}
}
