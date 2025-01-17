package exc;

public class Testfinally2 {
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
			System.out.println(ss[0]);
			boolean flag = true;
			if(flag)
				
			System.exit(0);//We terminate the jvm:This is the only way the finally block don't execute.
			System.out.println("end of try");
		
		}finally {
			System.out.println("methods finally");
		}
		System.out.println("Method end..!");
	}

}
