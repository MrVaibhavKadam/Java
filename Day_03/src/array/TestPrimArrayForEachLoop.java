package Day_03.src.array;
import java.util.Arrays;
import java.util.Scanner;
public class TestPrimArrayForEachLoop {
    public static void main (String [] ss){
       Scanner sc = new Scanner(System.in);
       System.out.println("How many data samples?");
       double[] data=new double[sc.nextInt()];//Ref:Reference type of array, Var:Method local variable, Store:on Stack,Space:As per JVM specification(4/8/16)

       //Using for each loop
       for(double d :data)
       System.out.print(d+" ");
       System.out.println();
       System.out.println("Name of the loaded class for array is"+data.getClass().getName());
       //Accept data from user and stored it in Array.
       for(int i=0;i<data.length;i++)
       {
         System.out.println("Enter array data");
         data[i]=sc.nextDouble();

       }
         
         for(double d :data)
         System.out.println(d+" ");
         
         for(double d :data)
         d*=2;
         System.out.println("What is the o/p ?");
         for(double d :data)
         System.out.println(d+" ");
         //Display array data using java.util.Arrays
         //method:public staatic Strion toString(double[d])
        //  System.out.print();
         System.out.println("Array Data via toString"+Arrays.toString(data));

       sc.close();

    }
}