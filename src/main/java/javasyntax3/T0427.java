package javasyntax3;

/*
Введи с клавиатуры целое число в диапазоне 1 - 999. Выведи его строку-описание следующего вида:

    «четное однозначное число» - если число четное и имеет одну цифру;
    «нечетное однозначное число» - если число нечетное и имеет одну цифру;
    «четное двузначное число» - если число четное и имеет две цифры;
    «нечетное двузначное число» - если число нечетное и имеет две цифры;
    «четное трехзначное число» - если число четное и имеет три цифры;
    «нечетное трехзначное число» - если число нечетное и имеет три цифры.

Если введенное число не попадает в диапазон 1 - 999, не нужно ничего выводить на экран.

Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
Требования:

    •
    Программа должна считывать одно число c клавиатуры.
    •
    Программа должна использовать команду System.out.println() или System.out.print().
    •
    Если число четное и имеет одну цифру, вывести "четное однозначное число".
    •
    Если число нечетное и имеет одну цифру, вывести "нечетное однозначное число".
    •
    Если число четное и имеет две цифры, вывести "четное двузначное число".
    •
    Если число нечетное и имеет две цифры, вывести "нечетное двузначное число".
    •
    Если число четное и имеет три цифры, вывести "четное трехзначное число".
    •
    Если число нечетное и имеет три цифры, вывести "нечетное трехзначное число".
    •
    Если введенное число не попадает в диапазон 1 - 999, ничего не выводить на экран
    •
    Программа должна выводить только строку-описание числа и больше ничего.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T0427 {
    private final BufferedReader bufferedReader;

    public T0427(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public static void main(String[] args) throws IOException {
        T0427 t0427 = new T0427(new BufferedReader(new InputStreamReader(System.in)));
        t0427.showNumberAndOdd(t0427.readUserNumber());
    }

    public int readUserNumber() throws IOException {
        return Integer.parseInt(bufferedReader.readLine());
    }

    public void showNumberAndOdd(int number) {
        String verdict;
        if (number < 1 || number > 999) {
        } else {
            if (number % 2 == 0) {
                if (number / 100 >= 1) {
                    verdict = "четное трехзначное число";
                } else if (number / 10 >= 1) {
                    verdict = "четное двузначное число";
                } else {
                    verdict = "четное однозначное число";
                }
            } else {
                if (number / 100 >= 1) {
                    verdict = "нечетное трехзначное число";
                } else if (number / 10 >= 1) {
                    verdict = "нечетное двузначное число";
                } else {
                    verdict = "нечетное однозначное число";
                }
            }
            System.out.println(verdict);
        }
    }
}

/*
if (number > 0 && number < 10 && number % 2 == 0) {
            System.out.println("четное однозначное число");
        } else if (number > 0 && number < 10 && number % 2 != 0) {
            System.out.println("нечетное однозначное число");
        } else if (number > 9 && number < 100 && number % 2 == 0) {
            System.out.println("четное двузначное число");
        } else if (number > 9 && number < 100 && number % 2 != 0) {
            System.out.println("нечетное двузначное число");
        } else if (number > 99 && number < 1000 && number % 2 == 0) {
            System.out.println("четное трехзначное число");
        } else if (number > 99 && number < 1000 && number % 2 != 0) {
            System.out.println("нечетное трехзначное число");
        }
 */