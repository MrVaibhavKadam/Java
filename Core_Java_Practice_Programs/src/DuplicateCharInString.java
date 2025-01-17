import java.util.stream.Collectors;

public class DuplicateCharInString {
	public static void main(String[] args) {
		
		String str = "better bitter";
		
		char[] strArr = str.toCharArray();
		boolean[] isVisited = new boolean[strArr.length];
		
		System.out.println("Duplicate Characters: ");
		
		str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c-> c, Collectors.counting()))
			.entrySet().stream().filter(entry -> entry.getKey()>1)
			.forEach(entry -> System.out.println(entry.getKey()+" times Appear "+entry.getValue()));
		
		System.out.println("Second Way:");
		for (int i = 0; i < strArr.length; i++) {
			if(isVisited[i] || strArr[i] == ' ') {
				continue;
			}
			boolean isDuplicate = false;
			for(int j = i+1; j < strArr.length;j++) {
				if (strArr[i] == strArr[j]) {
                    isDuplicate = true;
                    isVisited[j] = true; 
                }
			}
			if(isDuplicate)
				System.out.println(strArr[i]);
		}
		
		
		
	}
}
