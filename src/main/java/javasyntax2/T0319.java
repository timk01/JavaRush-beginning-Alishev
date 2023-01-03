package javasyntax2;

/*
Введи с клавиатуры отдельно Имя, число1, число2. Выведи надпись:
«Имя» получает «число1» через «число2» лет.

Пример:
Коля получает 3000 через 5 лет.
Требования:

    •
    Программа должна выводить текст.
    •
    Программа должна считывать данные с клавиатуры.
    •
    Выведенный текст должен содержать введенное имя.
    •
    Выведенный текст должен содержать введенное число1.
    •
    Выведенный текст должен содержать введенное число2.
    •
    Выведенный текст должен полностью соответствовать заданию.
 */

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T0319 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String sum = bufferedReader.readLine();
        String years = bufferedReader.readLine();
        System.out.println(name + " получает " + sum + " через " + years + " лет.");

        //не путать с бафферединпустстримом, который может быть полезен при работе с данными в виде байтов (например читать и писать в файл)
/*        BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);
        bufferedInputStream.read();*/

        //или еще, но уже про другой пример:
        //https://zetcode.com/java/fileinputstream/
    }
}
