package Seminar2;

import java.text.ParseException;

public class Task2 {

    public static void main(String[] args) {

        String[][] matrix = new String[4][3];
        try {
        System.out.println(sum2d(matrix));}
        catch (NumberFormatException e) {
            System.out.println("Cannot parse null string");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("There is no such index in array");
        }
    }

    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++){
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }


}
