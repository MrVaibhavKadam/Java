package Day_03.src.array;
import java.util.Scanner;
public class TestPrimitiveArray {
    public static void main (String [] ss){
       Scanner sc = new Scanner(System.in);
       System.out.println("How many data samples?");
       double[] data;//Ref:Reference type of array, Var:Method local variable, Store:on Stack,Space:As per JVM specification(4/8/16)

       data=new double[sc.nextInt()];
       for(int i=0;i<data.length;i++)
       System.out.print(data[i]+" ");
       System.out.println();
       System.out.println("Name of the loaded class for array is"+data.getClass().getName());
       //Accept data from user and stored it in Array.
       for(int i=0;i<data.length;i++)
       {
         System.out.println("Enter array data");
         data[i]=sc.nextDouble();

       }
         System.out.println("Inited array values");
         for(int i=0;i<data.length;i++)
         System.out.print(data[i]+" ");
       sc.close();

    }
}
