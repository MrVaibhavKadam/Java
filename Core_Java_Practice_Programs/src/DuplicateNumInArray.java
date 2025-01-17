import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import org.omg.CORBA.PRIVATE_MEMBER;

public class DuplicateNumInArray {
	
	private static void DuplicateElements(int[] arrInput) {
		
		for(int i = 0; i < arrInput.length; i++) {
			
			for(int j = i+1; j < arrInput.length; j++) {
				
				if (arrInput[i] == arrInput[j]) {
					System.out.println("Duplicate Nums are: "+ arrInput[i]);
				}
			}
		}
		
	}
	
	private static void DuplicateUsingSorting(int[] arrInput) {
		Arrays.sort(arrInput);
		for(int i = 0; i < arrInput.length-1; i++)
			if(arrInput[i] == arrInput[i+1])
				System.out.println("Duplicate Nums: "+ arrInput[i]);
	}
	
	private static void DuplicateUsingHashSet(int[] arrInput) {
		HashSet<Integer> hSet = new HashSet<>();
		
		for(int i: arrInput) {
			if (!hSet.add(i)) {
				System.out.println("Duplicate Nums: "+ i);
			}
		}		
	}
	
	 
	
	public static void main(String[] args) {
		
		int[] num = {1,3,5,4,6,5,6}; 
		DuplicateElements(num);
		DuplicateUsingSorting(num);
		DuplicateUsingHashSet(num);
	}
}
