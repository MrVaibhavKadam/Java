import java.util.Scanner;

public class MatrixPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No. of rows: ");
		int row = sc.nextInt();
		
		System.out.println("Enter No of columns: ");
		int column = sc.nextInt();
		
		int [][] matrix = new int[row][column];
		
		System.out.println("Enter Data: ");
		
		for(int i = 0; i < row;i++) {
			for(int j = 0; j < column;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Your matrix is: ");
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(matrix[i][j]+ "\t");
			}
		    System.out.println();
		}    
	}
}
