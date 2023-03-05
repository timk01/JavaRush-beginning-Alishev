package alishev_maraphone.logicsortingetc;

import java.util.Scanner;

public class PellWithSwitch {
    public static final int ZERO = 0;
    public static final int THIRTY = 30;

    public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(getPell(scanner));
        }
    }

    public static int getPell(Scanner scanner) {
        int n = scanner.nextInt();
        if (n < ZERO || n > THIRTY) {
            throw new IndexOutOfBoundsException("Число должно быть больше " + ZERO + " и меньше или равно " + THIRTY);
        }
        int firstNumber = 0;
        int secondNumber = 1;
        int pellNumber = 1;
        switch (n) {
            case 0:
            case 1:
                return n;
            default:
                for (int i = 2; i <= n; i++) {
                    pellNumber = 2 * secondNumber + firstNumber;
                    firstNumber = secondNumber;
                    secondNumber = pellNumber;
                }
                break;
        }
        return pellNumber;
    }
}



