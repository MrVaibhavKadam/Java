package p8;

import java.util.Arrays;
import java.util.stream.IntStream;

//combine two operations:Keep (Filter) Even elements n display on one line?-->YES
public class Test1 {

	public static void main(String[] args) {
		int data[]= {12,25,45,18,98,99,97,96,};
		//How to attach  a stream to Array.
		//Use Arrays class method-public static IntStream stream(int[]array)return a 
		//sequential IntStream with the specified array as its source.
		//IntStream: A i/f to represent sequence of primitive int-valued elements supporting sequential and parallel aggregate operations.
		IntStream intstrm=Arrays.stream(data);
		intstrm.filter(i->i%2==0).forEach(i->System.out.print(i+" "));
		//Write above two lines in one line
		Arrays.stream(data).filter(i->i%2==0).forEach(i->System.out.print("\n"+i));

	}

}
