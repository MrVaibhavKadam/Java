package maps;
import java.util.Comparator;
//display the map entries in descending order of integers.
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestTreeHashMap2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> hm=new TreeMap <>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		}
				);
		//unordered sorted Map:custom ordering based(Comparator's compare()method)
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
