package HW3.App.Checkers;

import HW3.App.Exceptions.BirthdayFormatException;

public class BirthdayChecker {
    protected String birthDay;

    public BirthdayChecker(String birthday) {
        this.birthDay = birthday;
    }

    public void checkBirthday(){
        if (!(birthDay.matches("\\d{2}\\.\\d{2}\\.\\d{4}"))) {
            throw new BirthdayFormatException("Неправильный формат даты рождения");
        }
    }
}
