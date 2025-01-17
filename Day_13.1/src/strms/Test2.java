package strms;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/*use var-args based method "of" to generate IntStream.eg(12,58,54,78,36,94,2,52,55)
  Find min and max value.(Hint-min and max method of Intstream)
  Print sorted asc ints.(sorted method of Intstream)
  seq. of operations: of--sorted--forEach
*/

public class Test2 {

	public static void main(String[] args) {
//		static IntStream of(int... values)
//		Returns a sequential ordered stream whose elements are the specified values.
		int min = IntStream.of(12, 15, 85, 46, 25, -11, 36, 99).min().orElse(002);

		System.out.println("Min " + min);
		int max = IntStream.of(12, 15, 85, 46, 25, -11, 36, 99).max().orElse(002);

		System.out.println("Max " + max);
		// display the ints asc order.
		System.out.println(" asc order");
		IntStream.of(12, 15, 85, 46, 25, -11, 36, 99).sorted().forEach(i->System.out.print(i+" "));

	}

}
