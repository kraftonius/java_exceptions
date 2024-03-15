package Seminar1;

public class Task3 {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, null, 3, 4, 5, 6};
        checkArray(array);

    }

    public static void checkArray(Integer[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                stringBuilder.append(i).append(" ");
            }
        }
        if (stringBuilder.length() != 0) {
            throw new RuntimeException(stringBuilder.toString());
        }
    }
}
