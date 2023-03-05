package alishev_maraphone.day1;

/*
2. Повторить задание 1, но используя цикл for .
 */

public class Task2 {
    public static final int TEN = 10;

    public static void main(String[] args) {
        for (int i = 0; i < TEN; i++) {
            String s = i != 9 ? "JAVA " : "JAVA";
            System.out.printf("%s", s);
        }
    }
}
