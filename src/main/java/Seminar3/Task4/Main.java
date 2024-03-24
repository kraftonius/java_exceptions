package Seminar3.Task4;

public class Main {

    public static void main(String[] args) {
        String[][] matrix = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11b", "12"},
                {"13", "14", "15", "oh now"}};

        try {
            System.out.println(matrixSum(matrix));
        } catch (MyArrayDataE | MyArraySizeE e) {
            System.out.println(e.getMessage());
        }


    }

    public static int matrixSum(String[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != 4 || matrix.length != 4) {
                throw new MyArraySizeE(matrix.length, matrix[i].length);
            }
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataE(i, j);
                }
            }
        }

        return sum;
    }
}



