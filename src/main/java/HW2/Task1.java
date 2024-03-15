package HW2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        boolean flag = false;
        while (!flag) {
            try {
                flag = InputFloatNumber();
            } catch (InputMismatchException e) {
                System.out.println("Wrong input");
            }
        }
    }

    public static boolean InputFloatNumber() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a float number: ");
        float num = in.nextFloat();
        System.out.println(num);
        return true;
    }
}