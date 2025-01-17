package arraylists_exercise;

import java.util.ArrayList;
import java.util.Collections;

public class CopyToAnotherCollection {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<>();

		color.add("Black");
		color.add("Maroon");
		color.add("Red");
		color.add("White");
		color.add("Green");
		
		System.out.println("List1:"+color);
		
		ArrayList<String> color1 = new ArrayList<>();
		
		color1.add("Pink");
		color1.add("Olive Green");
		color1.add("Yellow");
		color1.add("Blue");
		color1.add("Orang");
		
//		System.out.println("List2:"+color1);
//		
//		System.out.println("Coping elements of color1 to color");
//		
//		Collections.copy(color, color1);
//		
//		System.out.println("List1 after coping elements: "+ color);
//		
//		System.out.println("List2 after coping elements: "+ color1);
		
		System.out.println("Shuffle List1");
		Collections.shuffle(color);
		System.out.println(color);
		
		
		
	}

}
