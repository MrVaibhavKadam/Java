import java.util.Scanner;

public class RemoveSpacesFromStr {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Input String:");
		String inputString = scanner.nextLine();
		
		String stringWithoutSpaces1 = inputString.replaceAll("\\s+", "");
		System.out.println(stringWithoutSpaces1);
		
		System.out.println("Second Way: ");
		char[] charArray = inputString.toCharArray();
		
		String stringWithoutSpaces = "";
		
		for(int i = 0; i <inputString.length();i++) {
			if ((charArray[i] != ' ')&& (charArray[i] != '\t')) {
				stringWithoutSpaces = stringWithoutSpaces + charArray[i];
			}
		}
		System.out.println("Input String: "+ inputString);
		System.out.println("String Without Spaces: "+stringWithoutSpaces);
	}
}
