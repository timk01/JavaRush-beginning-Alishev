package javasyntax3;

/*
Введи с клавиатуры три целых числа. Выведи на экран количество положительных чисел среди этих трех.

Примеры:
а) при вводе чисел:
-4
6
6
получим вывод:
2

б) при вводе чисел:
-6
-6
-3
получим вывод:
0

в) при вводе чисел:
0
1
2
получим вывод:
2
Требования:

    •
    Программа должна считывать числа c клавиатуры.
    •
    Программа должна выводить число на экран.
    •
    Программа должна выводить количество положительных чисел в исходном наборе.
    •
    Если положительных чисел нет, программа должна вывести "0".
    •
    Учти, что "0" не относится ни к положительным, ни к отрицательным числам.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T0428 {
    private final BufferedReader bufferedReader;

    public T0428(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public static void main(String[] args) throws IOException {
        T0428 t0428 = new T0428(new BufferedReader(new InputStreamReader(System.in)));
        t0428.showNumberAndOdd(t0428.readUserNumber(), t0428.readUserNumber(), t0428.readUserNumber());
    }

    public int readUserNumber() throws IOException {
        return Integer.parseInt(bufferedReader.readLine());
    }

    public void showNumberAndOdd(int firstNumber, int secondNumber, int thirdNumber) {
        int positiveNumberCounter = 0;
        if (firstNumber > 0) {
            positiveNumberCounter++;
        }
        if (secondNumber > 0) {
            positiveNumberCounter++;
        }
        if (thirdNumber > 0) {
            positiveNumberCounter++;
        }
        System.out.println(positiveNumberCounter);
    }
}
