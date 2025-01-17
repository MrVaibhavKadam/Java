package maps;

import java.util.HashMap;
import java.util.Set;

import static java.util.Map.Entry;
public class TestMaps {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "avfs");
		hm.put(5, "def");
		hm.put(10, "bgfd54");
		hm.put(100, "15avfs");
		hm.put(53, "def89");
		hm.put(45, "abc1");
		hm.put(65, "avfs");
		hm.put(59, "nmop5");
		hm.put(91, "abcd3");
		
		//Display all entries from the HM, on separate lines.
		for(Entry<Integer, String> e : hm.entrySet())
			System.out.println(e.getKey()+ ":" +e.getValue());
		
	}

}
