package lambda_function;

interface Divider {
    double divide(int a, int b);
}

public class LambdaEx6 {
    public static void main(String[] args) {
        Divider divider = (a, b) -> {
            try {
                return a / b;
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
                return 0;
            }
        };
        System.out.println(divider.divide(10, 0));
    }
}
