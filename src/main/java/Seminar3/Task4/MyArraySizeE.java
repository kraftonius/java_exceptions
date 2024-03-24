package Seminar3.Task4;

public class MyArraySizeE extends RuntimeException {
    public MyArraySizeE(){
        super();
    }
    public MyArraySizeE(int rows, int columns) {
        super("Размер массива не 4 на 4, а :" + rows + "Х" + columns);
    }
}
