package alishev_maraphone.logicsortingetc;

/*
 * input : 10
 * output : 0 1 1 2 3 5 8 13 21 34 55
 */

public class FibonacchiLoopNonRecursive {

        public static void main(String args[]) {
            fibonacci(4);
        }


        public static void fibonacci(int number) {
            for (int i = 0; i < number; i++) {
                System.out.print(getFibonacci(i) + " ");
            }
        }

        public static int getFibonacci(int n) {
            if (n == 0) {
                return 0;
            }

            if (n == 1) {
                return 1;
            }

            int first = 0;
            int second = 1;
            int nth = 1;

            for (int i = 2; i <= n; i++) {
                nth = first + second;
                first = second;
                second = nth;
            }
            return nth;
        }
    }



