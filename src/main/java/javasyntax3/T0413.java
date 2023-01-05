package javasyntax3;

/*
Введи с клавиатуры номер дня недели. Далее, в зависимости от номера, выведи одно из названий: «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье».

Если введен номер больше 7 или меньше 1, выведи «такого дня недели не существует».

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует
Требования:

    •
    Программа должна считывать число c клавиатуры.
    •
    Программа должна выводить текст на экран.
    •
    Если введено число от 1 до 7, необходимо вывести день недели.
    •
    Если введено число, не входящее в интервал от 1 до 7, то вывести уведомление, что такого дня недели не существует.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class T0413 {
    public static Locale locale = new Locale("ru");

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());

        //так, по идее, вернее.
        String day = "такого дня недели не существует";
        if (number > 0 && number < 8) {
            day = getDayOfWeek(number, locale);
        }
        System.out.println(day);

        /*switch(number) {
            case 1, 2, 3, 4, 5, 6, 7:
                System.out.println(getDayOfWeek(number, locale));
                break;
            default:
                System.out.println("такого дня недели не существует");
                break;
        }*/
    }

    static String getDayOfWeek(int number, Locale locale) {
        return DayOfWeek.of(number).getDisplayName(TextStyle.FULL, locale);
    }
}
