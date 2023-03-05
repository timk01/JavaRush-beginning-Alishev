package alishev_maraphone.day1;

/*
3. Вывести на экран слово “JAVA” , в столбик, чтобы оно повторилось 10 раз,
используя цикл на ваше усмотрение ( for или while ).
Вывод в консоль должен быть таким:
JAVA
JAVA
JAVA
JAVA
JAVA
JAVA
JAVA
JAVA
JAVA
JAVA
 */

public class Task3 {
    public static final int TEN = 10;

    public static void main(String[] args) {
        for (int i = 0; i < TEN; i++) {
            String s = "JAVA";
            System.out.printf("%s%n", s);
        }
    }
}
