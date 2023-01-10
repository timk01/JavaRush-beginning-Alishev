package javasyntax4;

/*
Давай напишем программу, в которой нужно будет вводить числа с клавиатуры, и как только будет введено -1, вывести на экран сумму всех чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой задачи - использовать конструкцию:
while (true) {
int number = считываем число;
if (проверяем, что number -1)
break;
}
Требования:

    •
    Программа должна считывать числа c клавиатуры.
    •
    Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
    •
    Программа должна посчитать сумму введенных чисел и вывести её на экран.
    •
    В программе должен использоваться цикл for, while или do-while.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T0442 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
/*        do {
            int aUserNumber = Integer.parseInt(bufferedReader.readLine());
            sum += aUserNumber;
            if (aUserNumber == -1) {
                System.out.println(sum);
                break;
            }
        } while(true);*/

        int aUserNumber;
        do {
            aUserNumber = Integer.parseInt(bufferedReader.readLine());
            sum += aUserNumber;
            if (aUserNumber == -1) {
                System.out.println(sum);
            }
        } while(aUserNumber != -1);
    }
}
