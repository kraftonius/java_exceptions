package HW1.Task3;

import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        if (a.length == 0 || b.length == 0) {
            throw new RuntimeException("Пустой массив");
        }
        int[] c = new int[a.length];
        if (a.length != b.length) {
            return new int[1];
        } else {
            for (int i = 0; i < a.length; i++) {
                if (b[i] != 0) {
                    c[i] = a[i] / b[i];
                } else {
                    throw new RuntimeException("Деление на 0: " + a[i] + " / "+ b[i] + " -> " + (i+1) +"-й элемент. (index = " + i + ")");
                }
            }
        }
        return c;
    }
}

