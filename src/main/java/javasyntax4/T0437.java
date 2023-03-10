package javasyntax4;

/*
Используя цикл for, выведи на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
Требования:

    •
    Программа не должна считывать числа c клавиатуры.
    •
    Программа должна выводить числа на экран.
    •
    Программа должна выводить прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
    •
    В программе должен использоваться цикл for.
 */

public class T0437 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('8');
            }
            System.out.println();
        }

        //интересное решение в 1 цикл
/*        for (String s = "8"; s.length() <= 10 ; s += 8) {
            System.out.println(s);
        }*/
    }
}
