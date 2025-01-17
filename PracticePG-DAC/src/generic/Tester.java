package generic;

public class Tester {

	public static void main(String[] args) {
		//create a holder class instance to hold int value
		 Holder<Integer> h1=new Holder<Integer>(123);//int-->Integer: No need of Integer to Object.
		 int data=h1.getRef();// javac:auto unboxing(Integer --> int). no need of Programer:down casting
		 //create a holder class instance to hold String value.
		 Holder<String> h2=new Holder<String>("hello");//No Need  Of javac:up casting(String-->Object)
		 String s=h2.getRef();//No need of p:Down casting
		 //h1=h2;//Type mismatch error caught @ compile timme which is easy to solve.
		 data=(Integer)h1.getRef();//class cast exc:String can't cast to int.
		 
		 

	}

}
