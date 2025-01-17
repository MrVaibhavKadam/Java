package generics;
import java.util.Arrays;
import java.util.List;

public class TestGenericMethod {

	public static void main(String[] args) {
		//String[]---> List<String>
		List<String> strings=Arrays.asList("abc","fdas","gdfe","bgd","gfds");
		System.out.println(strings);
		System.out.println(strings.get(0));
//		strings.add("ads");unsupported operationException
//		strings.remove(strings.size()-1);
		strings.set(1, strings.get(1).toUpperCase());
		System.out.println("Strings again "+strings);
		System.out.println("Strings size "+strings.size());

	}

}
