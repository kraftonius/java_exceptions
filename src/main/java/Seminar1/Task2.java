package Seminar1;

public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0}
        };
        System.out.println("method3(matrix) = " + method3(matrix));
    }

    public static int method3(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length) {
                throw new RuntimeException("Массив не квадратный: " +
                        matrix.length + "X" + matrix[i].length);
            }
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[0][0] !=1 && matrix[0][0] !=0){
                    throw new RuntimeException("В массиве числа отличные от 0 и 1");
                }
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}