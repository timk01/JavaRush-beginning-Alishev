package javasyntax3;

//ex T0403

/*
Помоги коту обрести имя с помощью метода setName.
Требования:

    •
    Класс Cat должен содержать только одну переменную name.
    •
    Переменная name должна иметь модификатор доступа private и тип String.
    •
    Класс Cat должен содержать только два метода - setName и main.
    •
    Метод setName класса Cat должен устанавливать значение переменной private String name равным переданному параметру String name.

    public class Cat {
    private String name = "безымянный кот";

    public void setName(String name) {
        //напишите тут ваш код

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}

 */

import java.util.Objects;

public class Cat {
    private String name = "безымянный кот";
    int added;

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return added == cat.added && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, added);
    }
}
