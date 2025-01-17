package streams_practice;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

//If ‘n‘ is the positive number and ‘a‘ is an array of integers of length ‘n-1’ containing elements from 1 to n.
//Then find the missing number in ‘a’ in the range from 1 to n. Occurrence of each element is only once.
//For example, If n = 8, then array ‘a’ will have 7 elements in the range from 1 to 8. 
//For example {1, 4, 5, 3, 7, 8, 6}. One number will be missing in ‘a’ (2 in this case). You have to find out that missing number.
public class Assignment10 {

	public static void main(String[] args) {
		
		int n = 8;
		int [] arr = {1,2,3,4,6,7,8};
		
		Arrays.sort(arr);
		
//		int totalSum = n * (n + 1) / 2;
//		
//		int arraySum = Arrays.stream(arr).sum();
//		
//		int missingNumber = totalSum - arraySum;
//		System.out.println("The missing number is: "+ missingNumber);
		
		for(int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
			
			
				
			}
		}

	

}
