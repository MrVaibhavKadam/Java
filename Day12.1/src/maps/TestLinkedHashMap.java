package maps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class TestLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm=new LinkedHashMap<>();
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
