package lambda_function;

interface Addition {
    int add(int a, int b);
}

public class LambdaEx3 {
    public static void main(String[] args) {
        Addition adder = (a, b) -> a + b;
        System.out.println("Sum: " + adder.add(5, 3));
    }
}
