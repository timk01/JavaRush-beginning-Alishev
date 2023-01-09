package javasyntax4;

/*
Выведи на экран числа от 1 до 10, используя цикл while. Каждое значение - с новой строки.
Требования:

    •
    Программа не должна считывать числа c клавиатуры.
    •
    Программа должна выводить числа на экран.
    •
    Каждое значение должно быть выведено с новой строки.
    •
    Программа должна выводить числа от 1 до 10.
    •
    В программе должен использоваться цикл while.
 */

public class T0430 {
    /*private static int FINAL_NUMBER = 10;
    private static int START_NUMBER = 0;*/

    public static void main(String[] args) {
        int number = 0;
        while(number < 10) {
            System.out.println(++number);
        }

        /*while (START_NUMBER < FINAL_NUMBER) {
            System.out.println(++START_NUMBER);
        }*/
        //тесты... не прходит. а в лоб - проходит. :/
    }
}
