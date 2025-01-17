package lambda_function;

import java.io.*;

interface FileReaderLambda {
    void read(String fileName);
}

public class LambdaEx7 {
    public static void main(String[] args) {
        FileReaderLambda reader = fileName -> {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                System.out.println(br.readLine());
            } catch (IOException e) {
                System.out.println("File not found: " + e.getMessage());
            }
        };
        reader.read("nonexistent.txt");
    }
}

