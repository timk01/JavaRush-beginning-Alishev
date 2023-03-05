package alishev_maraphone.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) throws IOException {
/*        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int i = Integer.parseInt(bufferedReader.readLine());
        System.out.println("s " + s);
        System.out.println("i " + i);*/

        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            System.out.println(sc.nextInt());
        }
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

//про сканнер в том числе
//https://metanit.com/java/tutorial/2.9.php