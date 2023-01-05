package javasyntax3;

/*
Введи с клавиатуры два целых числа, которые будут координатами точки, не лежащей на осях OX и OY.
Выведи на экран номер координатной четверти, в которой находится данная точка.

Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:

    для первой четверти - a>0 и b>0;
    для второй четверти - a<0 и b>0;
    для третьей четверти - a<0 и b<0;
    для четвертой четверти - a>0 и b<0.

Пример для чисел 4 6:
1
Пример для чисел -6 -6:
3
Требования:

    •
    Программа должна считывать числа c клавиатуры.
    •
    Программа должна использовать команду System.out.println() или System.out.print().
    •
    Если точка находится в первой координатной четверти, вывести "1".
    •
    Если точка находится во второй координатной четверти, вывести "2".
    •
    Если точка находится в третей координатной четверти, вывести "3".
    •
    Если точка находится в четвёртой координатной четверти, вывести "4".
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T0425 {
    private final BufferedReader bufferedReader;

    public T0425(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public static void main(String[] args) throws IOException {
        T0425 t0425 = new T0425(new BufferedReader(new InputStreamReader(System.in)));
        t0425.showQuarterAccordingToCoordinates(t0425.readUserNumber(), t0425.readUserNumber());
    }

    public int readUserNumber() throws IOException {
        return Integer.parseInt(bufferedReader.readLine());
    }

    public void showQuarterAccordingToCoordinates(int firstCoordinate, int secondCoordinate) {
        int number;
        if (firstCoordinate > 0) {
            if (secondCoordinate > 0) {
                number = 1;
            } else {
                number = 4;
            }
        } else {
            if (secondCoordinate > 0) {
                number = 2;
            } else {
                number = 3;
            }
        }
        System.out.println(number);
    }
}

//можно и просто... в 4 ифа
/*
        if (a > 0 && b > 0) {
            System.out.println(1);
        } else if (a < 0 && b > 0) {
            System.out.println(2);
        } else if (a < 0 && b < 0) {
            System.out.println(3);
        } else if (a > 0 && b < 0) {
            System.out.println(4);
        }
 */
