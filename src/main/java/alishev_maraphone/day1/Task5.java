package alishev_maraphone.day1;

/*
5. Повторить задание 4, но используя цикл for .
 */

public class Task5 {
    public static final int FINAL_OLYMPIAD_YEAR = 2020;

    public static void main(String[] args) {
        //не конкатенацией
        StringBuilder sb = new StringBuilder();
        for (int year = 1980; year <= FINAL_OLYMPIAD_YEAR; year += 4) {
            sb.append("Олимпиада ");
            System.out.println(sb.append(year).append(" года"));
            sb.setLength(0);
        }
    }
}
