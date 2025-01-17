package lambda_function;

import java.util.*;

public class LambdaEx2 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango");
        fruits.sort((a, b) -> a.compareTo(b));
        System.out.println(fruits); 
    }
}
