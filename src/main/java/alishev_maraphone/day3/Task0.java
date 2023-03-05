package alishev_maraphone.day3;

//методы класса Стринг (не все, но которые забыл)

public class Task0 {
    public static void main(String[] args) {
        String hello = "Hello world";
        int start = 6;
        int end = 11;
        char[] chars = new char[end - start];
        hello.getChars(6, 11, chars, 0); //аналог charAt() только для массива
        System.out.println(chars);

        /*
        void method
        ему нужен массив (а размерность массива определяется при создании)
        читать как: С 6 и по 11 (т.е. 2 часть не эксклюзивно)
        */

        /*
        интересные, но которые периодически забываются:
         */

        boolean world = hello.regionMatches(6, "world", 0, 3); //true, wor
        System.out.println(world);

        //остальные вроде есть в голове.
    }
}
