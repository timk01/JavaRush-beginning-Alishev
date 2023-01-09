package javasyntax4;

/*
Введи с клавиатуры два числа - m и n.
Используя цикл for, выведи на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888
Требования:

    •
    Программа должна считывать два числа c клавиатуры.
    •
    Программа должна выводить текст на экран.
    •
    Программа должна выводить прямоугольник размером m на n из восьмёрок.
    •
    В программе должен использоваться цикл for.
 */

import java.util.Scanner;

public class T0436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int columns = scanner.nextInt();
        int rows = scanner.nextInt();
        for (int i = columns; i > 0; i--) {
            for (int j = rows; j > 0; j--) {
                System.out.print(8);
            }
            System.out.println();
        }

        //вариант
        /*
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('8');
            }

            System.out.println();
        }
         */
    }
}
