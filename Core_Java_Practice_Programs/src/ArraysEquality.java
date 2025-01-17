import java.util.Arrays;

public class ArraysEquality {
	public static void main(String[] args) {
		int [] arrOne = {1,2,3,4,6};
		int [] arrTwo = {1,2,3,4,6};
		
		boolean equalOrnot = true;
		
		if(arrOne.length == arrTwo.length) {
			for(int i = 0; i< arrOne.length;i++) {
				if(arrOne[i] != arrTwo[i]) {
				equalOrnot = false;
				}
			}
		}else {
			equalOrnot = false;
		}
		if (equalOrnot) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
		System.out.println("Second Way using Arrays.equals()");
		
		String [] strArr1 = {"Apple", "Banana", "Cat", "Dog", "Elephant"};
		String [] strArr2 = {"Apple", "Banana", "Cat", "Dog", "Elephant"};
		String [] strArr3 = {"Apple", "Banana", "Cat", "Shanks", "Luffy"};
		
		System.out.println(Arrays.equals(strArr1, strArr2));
		System.out.println(Arrays.equals(strArr1, strArr3));
		
		//If two arrays are having same elements but in different order the first sort the array and the use equals method.
		//When you are checking multidimensional arrays for equality then use deepEquals() methods.
	
	}
}
