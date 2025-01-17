package arraylists_exercise;

import java.util.ArrayList;

public class RemoveAll {

	public static void main(String[] args) {
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List Before removing elements: " + c1.isEmpty());
        
        c1.removeAll(c1);
        System.out.println("Empty List after removing elements: " + c1.isEmpty());

	}

}
