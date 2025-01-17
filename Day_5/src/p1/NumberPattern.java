package p1;

public class NumberPattern {

	public static void main(String[] args) {
		 int n = 4; // Change this value to control the number of rows

	        for (int i = 1; i <= n; i++) {
	            for (int j = n; j >= i; j--) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }

	}

}
