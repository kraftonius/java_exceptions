package HW3.App.Checkers;

import HW3.App.Exceptions.NameFormatException;

public class NamesChecker {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NamesChecker(String anyName) {
        this.name = anyName;
    }

    public void checkName() throws NameFormatException {

        if (!(name.matches("[а-яёА-ЯЁ]+"))) {
            throw new NameFormatException("В имени, фамилии и отчестве могут быть только киррилические буквы");
        }
    }

}
