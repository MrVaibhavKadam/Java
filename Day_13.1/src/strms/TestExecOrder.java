package strms;

import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/*use var-args based method "of" to generate IntStream.eg(12,58,54,78,36,94,2,52,55)
  Find min and max value.(Hint-min and max method of Intstream)
  Print sorted asc ints.(sorted method of Intstream)
  seq. of operations: of--sorted--forEach
*/

public class TestExecOrder {

	public static void main(String[] args) {
		System.out.println("What will be the output ");
		IntStream.rangeClosed(1, 20)//int stream 1-20
		.filter(i->{
			System.out.println("Filtering "+i);
			return i%2==0;
		})//Inn stream of all even ints between 1 to 20.
		.map(i->{System.out.println("Mapping "+i);
		return i+1;
		})
		.forEach(i->{System.out.println("Displaying "+i);});
        //Conclusion- no intermediate operations are executed until you provide the terminate operation.
	}

}
//Streams follow the vertical order of execution.
//output-What will be the output 
//Filtering 1
//Filtering 2
//Mapping 2
//Displaying 3
//Filtering 3
//Filtering 4
//Mapping 4
//Displaying 5
//Filtering 5
//Filtering 6
//Mapping 6
//Displaying 7
//Filtering 7
//Filtering 8
//Mapping 8
//Displaying 9
//Filtering 9
//Filtering 10
//Mapping 10
//Displaying 11
//Filtering 11
//Filtering 12
//Mapping 12
//Displaying 13
//Filtering 13
//Filtering 14
//Mapping 14
//Displaying 15
//Filtering 15
//Filtering 16
//Mapping 16
//Displaying 17
//Filtering 17
//Filtering 18
//Mapping 18
//Displaying 19
//Filtering 19
//Filtering 20
//Mapping 20
//Displaying 21