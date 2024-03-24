package Seminar3.Task3;

public class IndexOutOfBoundsE extends IndexOutOfBoundsException{
    public IndexOutOfBoundsE() {
        super("Выход за пределы массива");
    }
    public  IndexOutOfBoundsE(int i){
        super("Индекса " + i + " в массиве не существует");
    }
}
