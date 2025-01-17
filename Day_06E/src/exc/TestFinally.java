package exc;

public class TestFinally {
	public static void main (String []args) {
		System.out.println("1");
		try {
			testMe();
			System.out.println("Back in main");
		}catch(Exception e) {
			System.out.println("In mains catch");
		}finally {
			System.out.println("In mains final");
		}
		System.out.println("Main over");
	}
	private static void testMe() throws InterruptedException{
		try {
			System.out.println("in methods try");
			String ss[]= {"a","b"};
			Thread.sleep(1000);
			System.out.println(ss[10]);
			boolean flag = false;
			if(flag)
				return;
			System.out.println("end of try");
		
		}finally {
			System.out.println("methods finally");
		}
		System.out.println("Method end..!");
	}

}
