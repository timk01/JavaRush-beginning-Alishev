package alishev_maraphone.logicsortingetc;

import java.util.stream.IntStream;

public class MultiplicationTableSolution {
    public static void main(String[] args) {
        printMultiplicationTable();

        System.out.println();

        //todo later

        /*IntStream.rangeClosed(1, 9)
                .forEach(i ->
                        IntStream.rangeClosed(1, 9)
                                .map(j -> i * j)
                                .forEach(res ->
                                        System.out.println(i + " x " + j + " = " + res)));*/

        //IntStream.range(1, 10).forEach(i, j) -> System.out.printf("%d x %d = %-5d", i, j, (i*j));
    }

    private static void printMultiplicationTable() {
        String format = "%d x %d = %-5d";
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf(format, i, j, i*j);
            }
            System.out.println();
        }
    }
}

/*
(i, j, k) -> System.out.printf("%d x %d = %-5d", i, j, (i*j))
 */