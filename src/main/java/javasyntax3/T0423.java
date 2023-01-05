package javasyntax3;

/*
Введи с клавиатуры имя и возраст. Если возраст больше 20, выведи надпись: «И 18-ти достаточно».
Требования:

    •
    Программа должна считывать строки c клавиатуры.
    •
    Программа должна использовать команду System.out.println() или System.out.print().
    •
    Если возраст больше 20, вывести только сообщение "И 18-ти достаточно".
    •
    Если возраст меньше либо равно 20, ничего не выводить.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T0423 {
    private final BufferedReader bufferedReader;

    public T0423(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public static void main(String[] args) throws IOException {
        T0423 t0423 = new T0423(new BufferedReader(new InputStreamReader(System.in)));
        t0423.readUserString();
        t0423.showNonAdultPersonStatus(t0423.readUserNumber());
    }

    public int readUserNumber() throws IOException {
        return Integer.parseInt(readUserString());
    }

    public String readUserString() throws IOException {
        return bufferedReader.readLine();
    }

    public void showNonAdultPersonStatus(int age) {
        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}
