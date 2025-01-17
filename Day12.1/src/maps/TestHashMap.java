package maps;

import java.util.HashMap;
import static java.util.Map.Entry;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "abcd1");
		hm.put(10, "nbhvgc10");
		hm.put(56, "rdtfg56");
		hm.put(25, "hvhc25");
		hm.put(85, "vytfyf85");
		hm.put(15, "cdgc15");
		hm.put(19, "abcd19");
		hm.put(97, "abcd97");
		hm.put(100, "abcd100");
		//Display all entries from Hashmap,on separate line.
		for(Entry<Integer, String> e:hm.entrySet())
			System.out.println(e.getKey()+":"+e.getValue());
		
	}

}
