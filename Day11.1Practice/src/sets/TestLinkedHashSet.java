package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		List<Double> list = Arrays.asList(10.0,28.0,31.50,15.08,4.0);
		
		HashSet<Double> hSet = new HashSet<>(list);
		
		System.out.println("hSet: "+ hSet);

	}

}
