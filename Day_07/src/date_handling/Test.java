package date_handling;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Date curntDate=new Date();
		System.out.println(curntDate);
		Date epochDate=new Date(1);
		System.out.println(epochDate);
		System.out.println(curntDate.before(epochDate)+" "+curntDate.after(epochDate));
		System.out.println(curntDate.compareTo(epochDate));
		System.out.println(curntDate.equals(epochDate));

	}

}
