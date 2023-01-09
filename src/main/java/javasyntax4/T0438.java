package javasyntax4;

/*
Используя цикл for, выведи на экран:

    горизонтальную линию из 10 восьмёрок;
    вертикальную линию из 10 восьмёрок (символ из горизонтальной линии не учитывается).

Требования:

    •
    Программа не должна считывать числа c клавиатуры.
    •
    Программа должна выводить числа на экран.
    •
    Программа должна выводить горизонтальную линию из 10 восьмёрок.
    •
    Программа должна выводить вертикальную линию из 10 восьмёрок.
    •
    В программе должен использоваться цикл for.
 */

public class T0438 {
    public static void main(String[] args) {
        String bigString;
        String shortString;
        int rows;
        for (bigString = "8888888888", shortString = "8", rows = 0; rows < 10; rows++) {
            if (rows == 0) {
                System.out.println(bigString);
            }
            System.out.println(shortString);
        }

        //можно и в 2 цикла... или просто 1 цикл заменить на саут, как вариант
        /*for (int i = 0; i < 10; i++) {
            System.out.print('8');
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println('8');
        }*/
    }
}
