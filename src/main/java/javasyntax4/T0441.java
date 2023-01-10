package javasyntax4;

/*
Среднее такое среднее

Введи с клавиатуры три числа, выведи на экран среднее из них. Т.е. не самое большое и не самое маленькое.
Если все числа равны, выведи любое из них.
Требования:

    •
    Программа должна считывать числа c клавиатуры.
    •
    Программа должна выводить число на экран.
    •
    Программа должна выводить среднее из трех чисел.
    •
    Если все числа равны, вывести любое из них.
    •
    Если два числа из трех равны, вывести любое из двух.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class T0441 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(bufferedReader.readLine());
        int secondNumber = Integer.parseInt(bufferedReader.readLine());
        int thirdNumber = Integer.parseInt(bufferedReader.readLine());
        System.out.println(findMidNumber(firstNumber, secondNumber, thirdNumber)); //1 решение "в лоб"

        int[] arrayofInts = new int[]{firstNumber, secondNumber, thirdNumber}; //2 решение с сортировкой
        Arrays.sort(arrayofInts); //ascending
        System.out.println(findMidNumberFromArray(arrayofInts));

        System.out.println(findMidNumber2(firstNumber, secondNumber, thirdNumber)); //3 еще решение "в лоб", похожее на мое
        System.out.println(findMidNumber2(firstNumber, secondNumber, thirdNumber)); //4 ЕЩЕ ЛУЧШЕЕ решение "в лоб"
    }

    private static int findMidNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            return firstNumber;
        }
        if (firstNumber == secondNumber || firstNumber == thirdNumber) {
            return firstNumber;
        } else if (secondNumber == thirdNumber) {
            return secondNumber;
        }

        if (firstNumber < secondNumber && firstNumber > thirdNumber || firstNumber > secondNumber && firstNumber < thirdNumber) {
            return firstNumber;
        } else if (secondNumber < firstNumber && secondNumber > thirdNumber || secondNumber > firstNumber && secondNumber < thirdNumber) {
            return secondNumber;
        } else  {
            return thirdNumber;
        }
    }

    private static int findMidNumberFromArray(int[] array) {
        if (array[0] == array[1] && array[0] == array[2]) {
            return array[0];
        }
        if (array[0] == array[1]) {
            return array[0];
        }
        return array[1];
    }

    private static int findMidNumber2(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            return firstNumber;
        }
        if (firstNumber == secondNumber || firstNumber == thirdNumber) {
            return firstNumber;
        } else if (secondNumber == thirdNumber) {
            return secondNumber;
        }

        //a<b<c с одним знаком, a>b>c с другим
        //b<a<c, b>a>c
        if ((firstNumber < secondNumber && secondNumber < thirdNumber) || (thirdNumber < secondNumber && secondNumber < firstNumber)) {
            return secondNumber;
        }
        else if ((secondNumber < firstNumber && firstNumber < thirdNumber) || (thirdNumber < firstNumber && firstNumber < secondNumber)) {
            return firstNumber;
        }
        else {
            return thirdNumber;
        }
    }

    private static int findMidNumber3(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            return firstNumber;
        }
        if (firstNumber == secondNumber || firstNumber == thirdNumber) {
            return firstNumber;
        } else if (secondNumber == thirdNumber) {
            return secondNumber;
        }

        //a>b>c
        if (firstNumber > secondNumber) {
            if (secondNumber > thirdNumber) { //7 5 3
                return secondNumber;
            } else if (firstNumber > thirdNumber) { //7 3 5
                return thirdNumber;
            } else { //5 3 7
                return firstNumber;
            }
        //b>a>c
        } else {
            if (firstNumber > thirdNumber) { //5 7 3
                return firstNumber;
            } else if (secondNumber > thirdNumber) { //3 7 5
                return thirdNumber;
            } else { //3 5 7
                return secondNumber;
            }
        }
    }
}
