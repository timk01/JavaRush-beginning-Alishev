package alishev_maraphone.day1;

/*
Вывести на экран слово “JAVA” , в строку, чтобы оно повторилось 10 раз, используя
цикл while .
Вывод в консоль должен быть таким:
JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA
 */

public class Task1 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.print(i != 9 ? "JAVA " : "JAVA");
            i++;
        }
    }
}

//хрен знает, вроде бы и не нужно отдельное условие на послднюю строчк лепить. но - путсь будет.