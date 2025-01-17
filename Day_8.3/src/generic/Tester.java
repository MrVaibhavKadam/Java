package generic;

public class Tester {

	public static void main(String[] args) {
		//create a holder class instance to hold int value
		//Diamond operator:Generic type of RHS is inferred/deduced from LHS type.
		 Holder<Integer> h1=new Holder<>(123);//int-->Integer-->Object
		 int data=h1.getRef();// javac:auto unboxing.
		 //create a holder class instance to hold String value.
		 Holder<String> h2=new Holder<String>("hello");
		 String s=h2.getRef();//p:Down casting
		 //h1=h2;//Type mismatch error caught at the compile time.
		 
		 
		 

	}

}
