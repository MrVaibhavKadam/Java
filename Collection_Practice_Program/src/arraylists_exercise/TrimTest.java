package arraylists_exercise;

import java.util.ArrayList;

public class TrimTest {

	public static void main(String[] args) {
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List:" + c1);
        
        c1.trimToSize();
        
        System.out.println(c1);

	}

}
