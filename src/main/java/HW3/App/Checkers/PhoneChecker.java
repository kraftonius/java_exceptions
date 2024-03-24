package HW3.App.Checkers;

import HW3.App.Exceptions.PhoneFormatException;

public class PhoneChecker {
    protected String phone;

    public PhoneChecker(String phone) {
        this.phone = phone;
    }

    public void checkPhone() {

        if (!phone.matches("\\d+")) {
            throw new PhoneFormatException("в номере телефона должны быть только цифры");
        }

        if (phone.length() != 11) {
            throw new PhoneFormatException("неверное количество цифр в номере: " + phone.length() + " (должно быть 11");
        }

    }
}
