package javasyntax3;

/*
Введи с клавиатуры три целых числа. Выведи на экран количество положительных и отрицательных чисел в исходном наборе в следующем виде:
"количество отрицательных чисел: а"
"количество положительных чисел: б"
где а, б - искомые значения.

Примеры:
а) при вводе чисел:
2
5
6
получим вывод:
количество отрицательных чисел: 0
количество положительных чисел: 3

б) при вводе чисел:
-2
-5
6
получим вывод:
количество отрицательных чисел: 2
количество положительных чисел: 1
Требования:

    •
    Программа должна считывать числа c клавиатуры.
    •
    Программа должна выводить текст на экран.
    •
    Программа должна выводить количество отрицательных чисел в исходном наборе.
    •
    Программа должна выводить количество положительных чисел в исходном наборе.
    •
    Если отрицательных чисел нет, программа должна вывести "количество отрицательных чисел: 0".
    •
    Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
    •
    Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class T0429 {
    private final BufferedReader bufferedReader;

    public T0429(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public static void main(String[] args) throws IOException {
        T0429 t0429 = new T0429(new BufferedReader(new InputStreamReader(System.in)));
        t0429.showPositiveAndNegativeNumbers(t0429.readUserNumber(), t0429.readUserNumber(), t0429.readUserNumber());
    }

    public int readUserNumber() throws IOException {
        return Integer.parseInt(bufferedReader.readLine());
    }

    public void showPositiveAndNegativeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int positives = 0;
        int negatives = 0;
        if (firstNumber != 0) {
            if (firstNumber > 0) {
                positives++;
            } else {
                negatives++;
            }
        }
        if (secondNumber != 0) {
            if (secondNumber > 0) {
                positives++;
            } else {
                negatives++;
            }
        }
        if (thirdNumber != 0) {
            if (thirdNumber > 0) {
                positives++;
            } else {
                negatives++;
            }
        }
        System.out.println("количество отрицательных чисел: " + negatives + "\n" + "количество положительных чисел: " + positives);
    }
}
