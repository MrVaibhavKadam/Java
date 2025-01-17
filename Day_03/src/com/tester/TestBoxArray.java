package Day_03.src.com.tester;
import com.app.core.Box;
import java.util.Scanner;
public class TestBoxArray {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Boxes you want to make? ");
        Box boxes[];
        boxes = new Box[sc.nextInt()];
        //Display default array value using for-each
        for(Box b:boxes)
        System.out.println(b);
        for(int i=0;i<boxes.length;i++) {
            System.out.println("Enter box dimensions.");
           boxes[i] =new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        }
        for (Box b : boxes) {
            System.out.println("Box dimensions are="+b.getDetails()+"volume ="+b.computeVolume());
        }
        sc.close();
    }
    
}
