package strms;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/*use var-args based method "of" to generate IntStream.eg(12,58,54,78,36,94,2,52,55)
  Find min and max value.(Hint-min and max method of Intstream)
  Print sorted asc ints.(sorted method of Intstream)
  seq. of operations: of--sorted--forEach
*/

public class Test1 {

	public static void main(String[] args) {
//		static IntStream of(int... values)
//		Returns a sequential ordered stream whose elements are the specified values.
		IntStream in=IntStream.of(12,15,85,46,25,-11,36,99);
		OptionalInt min=in.min();
		if(min.isPresent())
			System.out.println("Min "+min.getAsInt());
		else
			System.out.println("No Value...");
		OptionalInt max=in.max();
		if(max.isPresent())
			System.out.println("Min "+max.getAsInt());//Exception-IllegalStateException-Stream already closed. 
		else
			System.out.println("No Value...");
		//we can iterate only once on any stream.

	}

}
