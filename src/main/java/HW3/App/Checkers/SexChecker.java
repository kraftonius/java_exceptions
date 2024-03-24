package HW3.App.Checkers;

import HW3.App.Exceptions.SexFormatException;

import java.util.Objects;

public class SexChecker {
    String sex;

    public SexChecker(String sex) {
        this.sex = sex;
    }

    public void checkSex(){
        if (!Objects.equals(sex, "m") && !Objects.equals(sex, "f")){
            throw new SexFormatException("Неверно уазан пол, разрешено указывать только латинское \"m\" или \"f\"" );
        }
    }
}
