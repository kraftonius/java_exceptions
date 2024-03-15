package HW2;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        double[] intArray = new double[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}