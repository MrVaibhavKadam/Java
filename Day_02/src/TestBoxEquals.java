import java.util.Scanner;

class TestBoxEquals {
    public static void main(String ss[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Dims of box1");
      Box box1 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
      System.out.println("box1 details"+" " +box1.getDetails());
      System.out.println("Enter Dims of box2");
      Box box2 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
      System.out.println(box2.getDetails());
      System.out.println(box1.isEqual(box2)?"same":"different");
      //create new box using offset
      System.out.println("Enter offset w, d, h");
        Box box4 = box1.createNewBox(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println("box4 details" +" " +box4.getDetails());
      sc.close();

    }
    
}
