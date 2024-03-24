package Seminar3.Task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundE {
//        int a = 1;
//        int b = 0;
//        try {
//            int c = a/b;
//        } catch (ArithmeticException e) {
//            throw new DivisionByZeroE();
//        }
//
//        int[] array = new int[3];
//        int j = 10;
//        try {
//            int i = array[j];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            throw new IndexOutOfBoundsE(j);
//        }

        String path = "this_is_path";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            System.out.println("this is text");
        } catch (FileNotFoundException e){
            throw new FileNotFoundE(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
