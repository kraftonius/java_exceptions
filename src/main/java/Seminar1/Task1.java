package Seminar1;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        System.out.println();
        method2(array, 7);

    }
    public static int createArray(int[] array, int a) {
        if (array == null) {
            return -3;
        }
        int buf = array.length;
        if (buf < 10) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                return i;
            }
        }
        return -2;
    }

    public static void method2(int[] array, int a){
        int buf = createArray(array, a);
        if(buf == -1) {
            System.out.println("Длинна массива меньше заданного минимума");
        } else if (buf == -2) {
            System.out.println("искомы элемент не найден");
        } else if (buf == -3){
            System.out.println("Вместо массива пришел null");
        }
    }
}
