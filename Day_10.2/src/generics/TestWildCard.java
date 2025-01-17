package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestWildCard {

	public static void main(String[] args) {
		List<Integer> ints=Arrays.asList(1,2,3,4,5,6);
		List<String> strings=Arrays.asList("one","two","three","four","five");
		List<Double> doubles=Arrays.asList(1.32,3.6,4.5,8.9,3.0,9.0,10.36);//All are fixed type list.
		//Collections class method: public static void shuffle(List<?>list). 
		Collections.shuffle(ints);
		System.out.println(ints);
		Collections.shuffle(doubles);
		System.out.println(doubles);
		Collections.shuffle(strings);
		System.out.println(strings);
		

	}

}
