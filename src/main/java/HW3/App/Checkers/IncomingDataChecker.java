package HW3.App.Checkers;

import HW3.App.Exceptions.IncomingDataException;

public class IncomingDataChecker {
    protected String[] data;

    public IncomingDataChecker(String[] data) {
        this.data = data;
    }

    public void checkData(){
        if (data.length != 6) {
            String s;
            if (data.length > 6) {
                s = "много";
            } else {
                s = "мало";
            }
            throw new IncomingDataException("Передано неверное количество данных, слишком " + s + ": " + data.length);
        }
    }

}
