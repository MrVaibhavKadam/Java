package arraylists_exercise;

import java.util.ArrayList;
import java.util.Collections;

public class CreateEx {

	public static void main(String[] args) {
		
		ArrayList<String> color = new ArrayList<>();
		
		color.add("Black");
		color.add("Maroon");
		color.add("Red");
		color.add("White");
		color.add("Green");
		color.add("Olive Green");
		color.add(1, "Orange");
		String s1 = color.get(2);
		System.out.println(s1);
		System.out.println(color);
		color.set(4, "Pink");
		color.remove(4);
		boolean c = color.contains("Maroon");
		System.out.println(c);
		
		if (color.contains("Maroon")) {
			System.out.println("Element Found");
		}else {
			System.out.println("There is no such element");
		}
		
		ArrayList<String> color1 = new ArrayList<>();
		
		color1.addAll(color);
		Collections.sort(color);
		System.out.println(color);
		//System.out.println(color1);
//		for (String s : color) {
//			System.out.println(s);
//		}
		
		//System.out.println(color);

	}

}
