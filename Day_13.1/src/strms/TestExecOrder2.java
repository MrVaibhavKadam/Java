package strms;

import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/*use var-args based method "of" to generate IntStream.eg(12,58,54,78,36,94,2,52,55)
  Find min and max value.(Hint-min and max method of Intstream)
  Print sorted asc ints.(sorted method of Intstream)
  seq. of operations: of--sorted--forEach
*/

public class TestExecOrder2 {

	public static void main(String[] args) {
		System.out.println("What will be the output ");
		IntStream.rangeClosed(1, 20)//int stream 1-20
		.map(i->{
			System.out.println("Maping "+i);
			return i+1;
		})//Inn stream of all even ints between 1 to 20.
		.filter(i->{System.out.println("Filtering "+i);
		return i%2==0;
		})
		.forEach(i->{System.out.println("Displaying "+i);});
        //Conclusion- no intermediate operations are executed until you provide the terminate operation.
	}

}
