package Seminar3.Task4;

public class MyArrayDataE extends NumberFormatException{
    public MyArrayDataE(){
        super("Не удалось преобразование");
    }
    public MyArrayDataE(int i, int j){
        super("Не удалось преобразование в ячейке " + i + "X" + j);
    }
}
