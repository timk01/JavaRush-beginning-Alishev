package javasyntax4;

/*
Выведи на экран строку N раз, используя цикл while. Каждое значение - с новой строки.

Пример ввода:
абв
2
Пример вывода:
абв
абв
Требования:

    •
    Программа должна считывать текст c клавиатуры.
    •
    Программа должна выводить текст на экран.
    •
    Каждое значение должно быть выведено с новой строки.
    •
    Программа должна выводить на экран строку N раз.
    •
    В программе должен использоваться цикл while.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T0432 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        int counter = Integer.parseInt(bufferedReader.readLine());

        while(counter > 0) {
            System.out.println(line);
            counter--;
        }
    }
}
