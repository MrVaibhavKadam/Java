package Day_03.src.com.tester;
import com.cdac.shapes.Rectangle;
import java.util.Scanner;
class TestRectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rect Details x y width height");
        Rectangle rect; 
        rect = new Rectangle(sc.nextInt(), sc.nextInt(), sc.nextDouble(),sc.nextDouble());
        System.out.println(rect.getRectDetails());
        sc.close();

    }
   
}