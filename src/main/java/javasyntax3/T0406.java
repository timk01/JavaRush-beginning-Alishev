package javasyntax3;

/*
Допиши код метода setName, чтобы с его помощью установить значение private String fullName, равное значению локальной переменной String fullName.
Требования:

    •
    Класс Cat должен содержать только одну переменную fullName.
    •
    Переменная fullName должна иметь модификатор доступа private и тип String.
    •
    Класс Cat должен содержать только два метода - setName и main.
    •
    Метод setName должен иметь локальную переменную fullName.
    •
    Метод setName класса Cat должен устанавливать значение глобальной переменной private String fullName равным локальной переменной fullName.

    public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        //напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}

 */

public class T0406 {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;
    }

    public static void main(String[] args) {

    }
}
