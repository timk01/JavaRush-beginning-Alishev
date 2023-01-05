package javasyntax3;

/*
Введи с клавиатуры число. Если число положительное, увеличь его в два раза. Если число отрицательное, прибавь единицу.
Если введенное число равно нулю, выведи число ноль.
Выведи результат на экран.
Требования:

    •
    Программа должна считывать число c клавиатуры.
    •
    Программа должна выводить число на экран.
    •
    Если введенное число положительное, необходимо увеличить его в два раза и вывести.
    •
    Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
    •
    Если введенное число равно нулю, необходимо вывести число ноль.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T0412 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());

        System.out.println(number >= 0 ? number * 2 : ++number);

        //получше. чутка.
        /*if (number > 0) {
            number = number * 2;
        } else if (number < 0) {
            number = number + 1;
        }
        System.out.println(number);*/

        //в лоб
        /*if (number > 0) {
            System.out.println(number * 2);
        } else if (number < 0) {
            System.out.println(++number);
        } else {
            System.out.println(0);
        }*/
    }
}
