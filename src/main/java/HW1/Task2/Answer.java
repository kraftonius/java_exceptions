package HW1.Task2;

import java.util.Arrays;

class Answer {
    public int[] subArrays(int[] a, int[] b){
        int[] c = new int[a.length];
        if (a.length != b.length) {
            return new int[1];
        } else {
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] - b[i];
            }
        }
        return c;
    }
}