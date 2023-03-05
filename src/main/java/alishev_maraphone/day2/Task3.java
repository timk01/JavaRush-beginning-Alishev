package alishev_maraphone.day2;

import java.util.Scanner;

import static alishev_maraphone.day2.Task2.getNumber;

/*
3. Реализовать программу №2, используя цикл while .
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = getNumber(scanner);
        int numberB = getNumber(scanner);
        if (numberA >= numberB) {
            System.out.println("Некорректный ввод");
        }
        int i = numberA + 1;
        while (i < numberB) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i + " ");
            }
            i++;
        }
    }
}
