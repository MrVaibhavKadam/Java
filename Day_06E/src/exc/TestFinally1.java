package exc;

public class TestFinally1 {
	
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
				//finally is used to clean up the resources.	
				System.out.println("methods finally");
				System.out.println("int value"+Integer.parseInt("abc"));//Here we get error
				//when we get error in the finally block then also jvm stops the execution of finally block.
				System.out.println("End of mehods finally");
			}
			System.out.println("Method end..!");
		}

	}
//Output-
//1
//in methods try
//methods finally
//In mains catch
//In mains final
//Main over




