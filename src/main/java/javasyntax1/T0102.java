package javasyntax1;

/*
Написать программу, выводящую на экран надпись «Элли очень умная» 5 раз. Каждый раз – с новой строки.

Пример вывода на экран:
Элли очень умная
Элли очень умная
Элли очень умная
Элли очень умная
Элли очень умная
Требования:

    •
    Программа должна выводить текст.
    •
    Текст должен начинаться с "Элли".
    •
    Текст должен заканчиваться на "умная".
    •
    Текст должен состоять из 5 строк.
    •
    Выводимый текст должен соответствовать заданию.
 */

public class T0102 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Элли очень умная");
        }
    }
}
