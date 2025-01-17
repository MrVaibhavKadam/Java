package p5;

public class C implements A,B {
	@Override
	public void show() {
//		System.out.println("In C's show "+data);//Here is ambiguity because compiler dont know which data is to be take
		//for avoiding such scenario write as given below.
		
		System.out.println("In C's show "+A.data+" "+B.data);
	}

}
