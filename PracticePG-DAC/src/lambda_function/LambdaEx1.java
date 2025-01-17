package lambda_function;

import java.util.*;

public class LambdaEx1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ajay", "Vijay", "Rajat");
        names.forEach(name -> System.out.println(name));
    }
}

