package javasyntax4;

/*
Выведи на экран квадрат из 10х10 букв S, используя цикл while. Буквы в каждой строке не разделяй пробелами.

Пример вывода на экран:
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
Требования:

    •
    Программа не должна считывать текст c клавиатуры.
    •
    Программа должна выводить текст на экран.
    •
    Программа должна выводить квадрат из 10х10 букв S.
    •
    В программе должен использоваться один или несколько циклов while.
 */

public class T0433 {
    public static void main(String[] args) {
        int outerCounter = 10;
        char aChar = 'S';
        while(outerCounter > 0) {
            int innerCounter = 10;
            while (innerCounter > 0) {
                System.out.print(aChar);
                innerCounter--;
            }
            System.out.println();
            outerCounter--;
        }
    }
}
