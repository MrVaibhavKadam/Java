package arraylists_exercise;

import java.util.ArrayList;

public class CloneOfClass {

	public static void main(String[] args) {
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List:" + c1);
        
        ArrayList<String> newC1 = (ArrayList<String>)c1.clone();//clone() method returns Object we have to explicitly cast it to ArrayList.
        System.out.println("newC1: " + newC1);
	}

}
