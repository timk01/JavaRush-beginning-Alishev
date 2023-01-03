package javasyntax2;

/*
Внеси изменения в программу, чтобы переменная name имела значение Amigo.
Требования:

    •
    Переменной name должно присваиваться значение сразу после создания.
    •
    Должно быть объявлено 2 переменных.
    •
    Значение переменной text изменять нельзя.
    •
    Команду вывода текста на экран изменять нельзя.
    •
    Программа должна выводить текст "Hello, Amigo!".

    Was:

        String name = "Ellie";
        String text = "Hello, " + name + "!";
        System.out.println(text);
 */

public class T0116 {
    public static void main(String[] args) {
        String name = "Amigo";
        String text = "Hello, " + name + "!";
        System.out.println(text);
    }
}
