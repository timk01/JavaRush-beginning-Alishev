package javasyntax2;

/*
Введи с клавиатуры имя и число, а затем выведи на экран строку: Через «число» лет «имя» захватит мир. Му-ха-ха!

Пример:
Через 8 лет Вася захватит мир. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
Требования:

    •
    Программа должна выводить текст.
    •
    Программа должна считывать данные с клавиатуры.
    •
    Выведенный текст должен содержать введенное имя.
    •
    Выведенный текст должен содержать введенное число.
    •
    Выведенный текст должен полностью соответствовать заданию.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class T0318 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReaderFromKeyboard = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReaderFromKeyboard.readLine();
        int period = Integer.parseInt(bufferedReaderFromKeyboard.readLine()); //можно без парсинга, т.к. экеспшн
        System.out.println("Через " + period + " лет " + name + " захватит мир. Му-ха-ха!");

        //а вообще, атк было правильней если в одну строчку...
/*        String[] arrayOfUserData = bufferedReaderFromKeyboard.readLine().split(" ");
        System.out.println("Через " + arrayOfUserData[1] + " лет " + arrayOfUserData[0] + " захватит мир. Му-ха-ха!");*/

        //со сканнером
/*        Scanner scanner = new Scanner(System.in);
        String name = "";
        if (scanner.hasNextLine()) {
            name = scanner.nextLine();
        }
        int years = -1;
        if (scanner.hasNextInt()) {
            years = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Через " + years + " лет " + name + " захватит мир. Му-ха-ха!");*/
    }
}
