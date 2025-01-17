package strms;

import java.util.Arrays;
import java.util.List;

public class TestMethodReference {

	public static void main(String[] args) {
		List<Integer> ints=Arrays.asList(12,15,85,46,25,-11,36,99);
		System.out.println("Display via lambda expression ");
		ints.stream().forEach(i->System.out.println(i));
		//Is there any way to add more conciseness to lambda expression? YES:Method Ref.
		//If lambda exp. simply calling existing method	in it's body: then it can be replaced by method ref.
		//syntax of method ref:Invoker object::existing method name
		System.out.println("Display via method ref");
		ints.stream().forEach(System.out::println);
		//Can below code is replaced by method ref? NO-> in the below code we are not just passing the arguments with it we passes the space (" ").
		ints.stream().forEach(i->System.out.print(i+" "));
		
	}

}
