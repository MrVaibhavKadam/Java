package exc;

import java.util.Scanner;

public class TestTryWithResources {

	public static void main(String[] args) {
		//Try block cannot exits on its own
		//Try with resources exists on its own it is equivalent to try-finally block.
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter ur name");
			System.out.println("Hello"+sc.nextLine());
			System.out.println("Enter ur age");
			System.out.println("age"+sc.nextInt());
			System.out.println("End of try with resources");
			
			System.out.println("main over");
			
		}

	}

}
