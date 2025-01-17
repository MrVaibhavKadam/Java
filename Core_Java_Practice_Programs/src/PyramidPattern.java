import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No of rows: ");
		int rows =sc.nextInt();
		
		int rowCount = 1;
		
		for (int i = rows; i > 0; i--) {
			
			for(int j = 1; j <= i; j++)
				System.out.print(" ");
			for(int j = 1; j <= rowCount; j++)
				System.out.print(rowCount + " ");
			System.out.println();
			
			rowCount++;
		}

	}

}
