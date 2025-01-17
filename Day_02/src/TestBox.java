import java.util.Scanner;
  class TestBox {
    public static void main(String[] args) {
      //int data;//Primitive , local var, : stack memory:4bytes
      //System.out.println(data);javac err
      //create scanner class instance: System.in=>std input
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter box dims: width depth height");
      Box b1;//ref type of variable:class type of ref, method local var:stack
      //No object are yet created on heap: as per JVM specification(4,8,16,...)bytes will be allocated on stack
      //System.out.println(b1);javac err
      b1= new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());//1 pbj is dynamic created in heap
      //display box's dimensions
      System.out.println(b1.getDetails());
      //display vol
      System.out.println("Volume=" +b1.computeVolume());
      
       
    }
    
}
