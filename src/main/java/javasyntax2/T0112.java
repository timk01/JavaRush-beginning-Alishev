package javasyntax2;

/*
Дана переменная number (она уже создана: к ней можно обращаться по имени с любого места программы).
Напиши программу, которая посчитает квадрат числа переменной number и выведет его на экран.

Подсказка:
квадрат — результат умножения числа на себя (number * number).
Требования:

    •
    У переменной number можно менять только значение.
    •
    В программе должен использоваться вывод на экран.
    •
    Выводимый текст должен быть числом.
    •
    Выводимый текст должен быть квадратом переменной number.
 */

public class T0112 {
    public static int number = 25;

    public static void main(String[] args) {
        System.out.println(squareRoot(number));
    }

    public static int squareRoot(int number) {
        return (int) Math.pow(number, 2);
    }
}
