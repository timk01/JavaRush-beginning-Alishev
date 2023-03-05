package alishev_maraphone.day3;

/*
2. Реализовать программу, которая пока работает, принимает на вход от пользователя
два числа - делимое и делитель. Для этих двух чисел программа рассчитывает
результат деления и выводит его в консоль. Программа останавливает свою работу
тогда, когда пользователь вводит 0 в качестве делителя.
(для этих вещественных чисел необходимо использовать тип double и метод
nextDouble() у Scanner ’а соответственно).
Пример:
1 2 - ваш ввод в консоль
0.5 - ответ программы
100 77 - ваш ввод в консоль
1.2987012987012987 - ответ программы
3 0 - ваш ввод в консоль
работа программы завершается
 */

import java.util.Scanner;

public class Task2 {
    public static final double ZERO = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double divider;
        double dividend;
        do {
            divider = scanner.nextDouble();
            dividend = scanner.nextDouble();
            if (dividend == ZERO) {
                break;
            }
            System.out.printf("%.15f%n", divider/dividend);
        } while (true);
    }
}

/*
1,298701 - если просто оставить Ф (т.е. до 6 знака)
1.2987012987012987 - есть .15
 */