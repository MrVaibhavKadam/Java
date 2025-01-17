package non_generic;

public class Tester {

	public static void main(String[] args) {
		//create a holder class instance to hold int value
		 Holder h1=new Holder(123);//int-->Integer-->Object
		 int data=(Integer)h1.getRef();//Programer:down casting, javac:auto unboxing.
		 //create a holder class instance to hold String value.
		 Holder h2=new Holder("hello");//javac:up casting(Strimg-->Object)
		 String s=(String)h2.getRef();//p:Down casting
		 h1=h2;
		 data=(Integer)h1.getRef();//class cast exc:String can't cast to int.
		 
		 

	}

}
