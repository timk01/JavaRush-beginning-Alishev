package javasyntax2;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ScannerAndReader {
    public static void main(String[] args) throws IOException {
       /* //1. Сканнер

        Scanner scanner = new Scanner(System.in);
        String nextScannerToken = scanner.next();//до пробельного символа (пробел, табуляция, перенос строки)
        int nextInt = scanner.nextInt();//конкретный тип данных (числовых)
        String nextLine = scanner.nextLine();//целиком вся строка (с пробелами), но ентера;

        //важно проверять, что там есть ЧТО читать, иначе можно выхватить эксепшен (например вместо инта на 9 ввести символы)
        //обычно в циклах - см. 2 метода дальше

        System.out.println("nextScannerToken " + nextScannerToken + " nextInt " + nextInt + " nextLine " + nextLine);

        *//*
        scanner.hasNext();
        scanner.hasNextInt();
        scanner.hasNextLine();
         *//*

        //правлиьней так:

        if (scanner.hasNext()) {
            nextScannerToken = scanner.next();
        }
        if (scanner.hasNextInt()) {
            nextInt = scanner.nextInt();
        }
        if (scanner.hasNextLine()) {
            nextLine = scanner.nextLine();
        }

        System.out.println("nextScannerToken " + nextScannerToken + " nextInt " + nextInt + " nextLine " + nextLine);

        System.out.println(requestNumber());
        System.out.println(requestWord("Timur"));
        System.out.println(requestDate("date"));*/

        /*Scanner scanner = new Scanner(System.in);

        boolean timeToStop = true;
        while (timeToStop) {
            if (scanner.hasNextInt()) {
                System.out.println("scanner.nextInt() " + scanner.nextInt());
                scanner.nextLine();
                timeToStop = false;
            }
            scanner.nextLine();
            //важно вставить после введенных данныз перевод коретки на следующую строку, если чсчитываем токен
            //в случае с просто строкой этого делать не нужно
        }*/

        //2. Стримы
        //https://javarush.com/groups/posts/1919-schitihvanie-s-klaviaturih--riderih
        /*while (true) {
            int x = System.in.read();
            System.out.println(x);
            break;
        }

        InputStream in = System.in; //внезапно! стандартный поток ввода
        // одна беда - тут байты, потому например будет:
        *//*Я
        208
        175
        10*//*

        //InputStreamReader не только получает данные из потока. Он еще и преобразует байтовые потоки в символьные
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("C:\\Users\\username\\Desktop\\testFile.txt"));
        //стрим для файлов, суть - та же*/

        InputStreamReader reader = new InputStreamReader(System.in);
        while (true) {
            int x = reader.read();
            System.out.println(x);
            break;
        }

        /*Я
        1071
        175
        10*/

        char x = 1071;
        System.out.println(x); //Я (10 - это перенос строки в обоих случаях)

        //т.е. В ПРИНЦИПЕ, можно и без буффера... а зачем он ? для производтельности + удобства.

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.read(); //кроме чтения одного символа,
        bufferedReader.readLine();
        // есть такая штука для чтения ЦЕЛОЙ строки, а не символа (сравни с предыдущим "голым" InputStreamReader, где ее нет!)
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        boolean isGoodInput;
        do {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                scanner.nextLine();
                if (n < 0) {
                    System.out.println("Number must be positive, try again");
                    isGoodInput = false;
                } else {
                    isGoodInput = true;
                }
            } else {
                System.out.println("It's not a number; try again, please \n");
                scanner.nextLine();
                isGoodInput = false;
            }
        } while (!isGoodInput);
        return n;
    }

    static String requestWord(String name) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        boolean isGoodInput = false;
        do {
            System.out.println("Please enter non-empty " + name + ":");
            if (scanner.hasNextLine()) {
                str = scanner.nextLine();
                isGoodInput = str != null && !str.isEmpty() && !str.trim().isEmpty();
            }
        } while (!isGoodInput);
        return str;
    }

    static LocalDateTime requestDate(String words) {
        Scanner scanner = new Scanner(System.in);
        String format = "yyyy:MM:dd HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        String str;
        boolean isGoodInput = true;
        LocalDateTime date = null;
        do {
            System.out.println("Please enter " + words + " in format " + format + " :");
            try {
                if (scanner.hasNextLine()) {
                    str = scanner.nextLine();
                    date = LocalDateTime.parse(str, formatter);
                    isGoodInput = true;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Parse exception, please enter date in the correct format!");
                isGoodInput = false;
            }
        } while (!isGoodInput);
        return date;
    }
}
