package lambda_function;

interface Square {
    int calculate(int x);
}

public class LambdaEx5 {
    public static void main(String[] args) {
        Square square = x -> x * x;
        System.out.println("Square of 5: " + square.calculate(5));
    }
}
