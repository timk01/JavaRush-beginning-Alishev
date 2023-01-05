package javasyntax3;

/*
Введи с клавиатуры имя и возраст. Если возраст меньше 18, выведи надпись: «Подрасти еще».
Требования:

    •
    Программа должна дважды считать данные c клавиатуры.
    •
    Программа должна использовать команду System.out.println() или System.out.print().
    •
    Если возраст меньше 18, вывести только сообщение "Подрасти еще".
    •
    Если возраст больше либо равно 18, ничего не выводить.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T0422 {
    private final BufferedReader bufferedReader;

    public T0422(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public static void main(String[] args) throws IOException {
        T0422 t0422 = new T0422(new BufferedReader(new InputStreamReader(System.in)));
        t0422.readUserString();
        t0422.showNonAdultPersonStatus(t0422.readUserNumber());
    }

    public int readUserNumber() throws IOException {
        return Integer.parseInt(readUserString());
    }

    public String readUserString() throws IOException {
        return bufferedReader.readLine();
    }

    public void showNonAdultPersonStatus(int age) {
        if (age < 18) {
            System.out.println("Подрасти еще");
        }
    }
}
