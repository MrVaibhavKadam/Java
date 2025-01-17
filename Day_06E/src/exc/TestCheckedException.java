package exc;

public class TestCheckedException {
//	public static void main(String []args) {
//		System.out.println("Befor");
//		Thread.sleep(3000);
//		System.out.println("After");
//		
//	}
//In above code we get the javac err. which is for the checked exception
//Because checked exceptions are detected by the javac and compiler forces the handling of checked exception.
//As shown in below code.There are two ways to handle it.
	public static void main(String []args)throws InterruptedException {
		//First way.
//		try {
//		    System.out.println("Befor");
//		    Thread.sleep(3000);
//		    System.out.println("After");
//		}catch(Exception e){//We can replace Exception by Throwable bcoz throwable is super class of exception.
		//but we dont use throwable because it also contains java.lang.Error.
//			e.printStackTrace();
//		}
//		System.out.println("Main over...");
		//using throws keyword is 2nd way.
		    System.out.println("Befor");
		    Thread.sleep(3000);
		    System.out.println("After");
		    
	}


}
