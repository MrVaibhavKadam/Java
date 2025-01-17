package lambda_function;

interface Checker {
    boolean isEven(int number);
}

public class LambdaEx4 {
    public static void main(String[] args) {
        Checker checker = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + checker.isEven(4));
    }
}
