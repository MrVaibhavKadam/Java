import java.util.Scanner;

public class SecondLargestNum {
	
	public static int SecondLargest(int input[]) {
		int firstLargest, secondLargest;
		
		if (input[0] > input[1]) {
			firstLargest = input[0];
			secondLargest = input[1];
		}else {
			firstLargest = input[1];		 
            secondLargest = input[0];
		}
		
		for(int i = 2; i<input.length;i++) {
			
			if (input[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = input[i];
			}else if(input[i] < firstLargest) {
				secondLargest = input[i];
			}
		}
		return secondLargest;
			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
	    int size = sc.nextInt();
	    
	    int [] arr = new int[size];
	    
	    System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Second Largest Num: "+SecondLargest(arr));
		
	}
}
