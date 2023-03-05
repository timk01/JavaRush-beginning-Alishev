package alishev_maraphone.day2;

/*
Саму формулу смотреть в ресурсах

Реализовать программу, которая принимает на вход через консоль с помощью класса
Scanner , число x . Для этого числа, по формуле выше, необходимо вычислить
значение y .
(Для этих вещественных чисел x и y необходимо использовать тип double и метод
nextDouble() у Scanner ’а соответственно, чтобы считать из консоли число x ).
*Пояснение.
Формула для вычисления y содержит две составляющие - набор выражений для
вычисления значения y и условие, при котором то или иное выражение “срабатывает”.
Выполнение того или иного условия зависит от значения x . Например, если x = 100 ,
будет использовано самое первое выражение. С помощью него, используя значение x
будет вычислено значение y .
y = (100^2 - 10) / (100 + 7) = 93.3644859813
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = getDoubleNumber(scanner);
        double y;
        if (Double.compare(x, 5) >= 0) {
            y = (Math.pow(x, 2) - 10) / (x + 7);
        } else if (Double.compare(x, -3) > 0 && Double.compare(x, 5) < 0) {
            y = (x + 3) / (Math.pow(x, 2) - 2);
        } else {
            y = 420;
        }

        System.out.println(y);
    }

    static double getDoubleNumber(Scanner scanner) {
        double number;
        while (true) {
            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                scanner.nextLine();
                break;
            } else {
                System.out.println("not a double number, try again");
                scanner.nextLine();
            }
        }
        return number;
    }
}
