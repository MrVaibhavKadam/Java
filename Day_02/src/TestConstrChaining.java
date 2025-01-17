import java.util.Scanner;
class TestConstrChaining {
    public static void main(String ss[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of cube=");
        Box cube = new Box(sc.nextDouble());
        System.out.println("Volume=" +cube.computeVolume());
        System.out.println(cube.getDetails());

        sc.close();

    
    
    } 
}
