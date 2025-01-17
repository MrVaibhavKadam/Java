package methods;

public class PentagonalNumbers {
	
	public static int getPentagonalNum(int i) {
		return (i * (3*i - 1))/2;
	}

	public static void main(String[] args) {
		int count = 1;
		
		for (int i = 1; i <= 50; i++) {
//			System.out.println("%-6d", getPentagonalNum(i)); This method is not applicable.
			System.out.printf("%-6d", getPentagonalNum(i));
			
			if(count % 10 == 0) System.out.println();
			
			count++;
		}

	}

}
