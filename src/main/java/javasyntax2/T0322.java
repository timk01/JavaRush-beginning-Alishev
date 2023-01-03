package javasyntax2;

/*
Введи с клавиатуры три имени, а затем выведи на экран надпись: name1 + name2 + name3 = Чистая любовь, да-да!

Пример:
Вася + Ева + Анжелика = Чистая любовь, да-да!
Требования:

    •
    Программа должна выводить текст.
    •
    Программа должна считывать данные с клавиатуры.
    •
    Выведенный текст должен содержать введенное имя name1.
    •
    Выведенный текст должен содержать введенное имя name2.
    •
    Выведенный текст должен содержать введенное имя name3.
    •
    Выведенный тест должен полностью соответствовать заданию.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T0322 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        String name3 = bufferedReader.readLine();
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}
