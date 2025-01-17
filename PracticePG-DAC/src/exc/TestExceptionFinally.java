package exc;

import java.util.Scanner;

public class TestExceptionFinally {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("First num");
			int a = scanner.nextInt();
			
			System.out.println("Second num");
			int b = scanner.nextInt();
			
			System.out.println(a/b);
		} finally {
			
		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}

	}

}
