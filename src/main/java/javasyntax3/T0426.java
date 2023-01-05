package javasyntax3;

/*
Введи с клавиатуры целое число. Выведи на экран его строку-описание следующего вида:

    «отрицательное четное число» - если число отрицательное и четное;
    «отрицательное нечетное число» - если число отрицательное и нечетное;
    «ноль» - если число равно 0;
    «положительное четное число» - если число положительное и четное;
    «положительное нечетное число» - если число положительное и нечетное.

Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
Требования:

    •
    Программа должна считывать число c клавиатуры.
    •
    Программа должна использовать команду System.out.println() или System.out.print().
    •
    Если число отрицательное и четное, вывести "отрицательное четное число".
    •
    Если число отрицательное и нечетное, вывести "отрицательное нечетное число".
    •
    Если число равно 0, вывести "ноль".
    •
    Если число положительное и четное, вывести "положительное четное число".
    •
    Если число положительное и нечетное, вывести "положительное нечетное число".
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T0426 {
    private final BufferedReader bufferedReader;

    public T0426(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public static void main(String[] args) throws IOException {
        T0426 t0426 = new T0426(new BufferedReader(new InputStreamReader(System.in)));
        t0426.showNumberAndOdd(t0426.readUserNumber());
    }

    public int readUserNumber() throws IOException {
        return Integer.parseInt(bufferedReader.readLine());
    }

    public void showNumberAndOdd(int number) {
        String verdict;
        if (number == 0) {
            verdict = "ноль";
        } else {
            if (number < 0) {
                if (number % 2 == 0) {
                    verdict = "отрицательное четное число";
                } else {
                    verdict = "отрицательное нечетное число";
                }
            } else {
                if (number % 2 == 0) {
                    verdict = "положительное четное число";
                } else {
                    verdict = "положительное нечетное число";
                }
            }
        }
        System.out.println(verdict);
    }
}

//вариант
/*
if (number == 0) {
            System.out.println("ноль");
        } else if (number > 0 && number % 2 == 0) {
            System.out.println("положительное четное число");
        } else if (number > 0 && number % 2 != 0) {
            System.out.println("положительное нечетное число");
        } else if (number < 0 && number % 2 == 0) {
            System.out.println("отрицательное четное число");
        } else if (number < 0 && number % 2 != 0) {
            System.out.println("отрицательное нечетное число");
        }
 */