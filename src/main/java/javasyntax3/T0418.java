package javasyntax3;

/*
Введи с клавиатуры два целых числа и выведи на экран минимальное из них. Если два числа равны между собой, необходимо вывести любое.
Требования:

    •
    Программа должна считывать числа c клавиатуры.
    •
    Программа должна выводить число на экран.
    •
    Программа должна выводить на экран минимальное из двух целых чисел.
    •
    Если два числа равны между собой, необходимо вывести любое.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T0418 {
    private final BufferedReader bufferedReader;

    public T0418() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) throws IOException {
        T0418 task0418 = new T0418();
        task0418.showMinNumber(task0418.readUserNumber(), task0418.readUserNumber());
    }

    public void showMinNumber(int firstNumber, int secondNumber) {
        System.out.println(Math.min(firstNumber, secondNumber));
    }

    public int readUserNumber() throws IOException {
        return Integer.parseInt(bufferedReader.readLine());
    }
}
