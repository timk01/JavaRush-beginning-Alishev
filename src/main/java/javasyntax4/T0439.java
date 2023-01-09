package javasyntax4;

/*
Введи с клавиатуры имя и, используя цикл for, 10 раз выведи: <имя> любит меня.

Пример вывода на экран для имени Света:
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Требования:

    •
    Программа должна считывать имя c клавиатуры.
    •
    Программа должна выводить текст на экран.
    •
    Программа должна выводить 10 раз текст, указанный в задании.
    •
    В программе должен использоваться цикл for.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class T0439 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(bufferedReader.readLine()).append(" любит меня.");
        for (int i = 0; i < 10; i++) {
            System.out.println(sb);
        }
    }
}
