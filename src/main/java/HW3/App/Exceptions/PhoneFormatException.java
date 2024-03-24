package HW3.App.Exceptions;

public class PhoneFormatException extends IllegalArgumentException {
    public PhoneFormatException(String message) {
        super(message);
    }
}
