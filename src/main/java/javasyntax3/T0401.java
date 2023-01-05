package javasyntax3;

/*
Подумай, что делает программа.
Исправьте ошибку в программе, чтобы переменная age объекта person изменила свое значение.

Подсказка: тщательно просмотрите метод adjustAge.
Требования:

    •
    Программа должна выводить текст на экран.
    •
    Класс Person должен иметь публичное поле age типа int.
    •
    Метод adjustAge класса Person должен выводить текст на экран.
    •
    Метод adjustAge класса Person должен иметь только один параметр age типа int и тип возвращаемого значения void.
    •
    Метод main должен вызывать метод adjustAge только один раз.
    •
    Метод adjustAge класса Person должен увеличивать возраст человека (Person) на 20.

    public class T0401 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Возраст: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Измененный возраст: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            age = age + 20;
            System.out.println("Измененный возраст = " + age + " + 20");
        }
    }
}

 */

public class T0401 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Возраст: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Измененный возраст: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = age + 20;
            System.out.println("Измененный возраст = " + age + " + 20");
        }
    }
}
