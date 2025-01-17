package mostaskedjava8programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListIntoMap {
	public static void main(String[] args) {
		List<Notes> noteLst = new ArrayList<>();
	    noteLst.add(new Notes(1, "note1", 11));
	    noteLst.add(new Notes(2, "note2", 22));
	    noteLst.add(new Notes(3, "note3", 33));
	    noteLst.add(new Notes(4, "note4", 44));
	    noteLst.add(new Notes(5, "note5", 55));

	    noteLst.add(new Notes(6, "note4", 66));
	    
	    Map<String, Integer> notesMap = noteLst.stream().sorted(Comparator.comparingInt(Notes::getId).reversed())
	    									   .collect(Collectors.toMap(Notes::getNoteString, Notes::getId, (oldValue, newValue)-> oldValue, LinkedHashMap::new));
	    System.out.println(notesMap);
	}
}
