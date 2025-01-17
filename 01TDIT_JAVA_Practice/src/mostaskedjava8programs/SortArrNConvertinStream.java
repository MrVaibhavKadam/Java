package mostaskedjava8programs;

import java.util.Arrays;

public class SortArrNConvertinStream {

	public static void main(String[] args) {
		 int arr[] = { 99, 55, 203, 99, 4, 91 };
		 
		 Arrays.parallelSort(arr);//sort the array.
		 
		 Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
		 

	}

}
