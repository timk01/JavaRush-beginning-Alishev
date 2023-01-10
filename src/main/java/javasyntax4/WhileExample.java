package javasyntax4;

public class WhileExample {
    public static void main(String[] args) {
        int countDown = 10;

        while (countDown >= 0) {
            System.out.println("До старта: " + countDown);
            countDown--;
        }

        System.out.println("Поехали !");

        int count = 1;
        while (true) {
            System.out.println("Строка №" + count);
            if (count > 3) {
                break;
            }
            count++; // Без наращивания цикл будет выполняться вечно
        }

        count = 1;
        do {
            System.out.println("count = " + count);
            count++;
        } while (count < 11);

/*        for(int i = 0; i > -1; i++) {
            if(i % 1000000 == 0) System.out.println(i);
        }
        System.out.println("Loop ended");*/

        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue); //2147483647
        System.out.println(maxValue + 1); //-2147483648
        //почему ?
        //2147483648 не влезает.
        //2147483648 % 4миллиарда = 2147483648.
        //147483648 > 2147483647 ? да.
        //вычитаем из 2147483648 - (4миллиарда+1) --- здесь как бы 0 не учитывается

        for (int i = 0; i < 5; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < 5; j++) {
                System.out.print(j + " ");
            }
            System.out.print('\n');
        }

        int[][] array = {{0, 1, 2, 3, 4},
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print('\n');
        }

        System.out.println();

        int sum = 0;    // итоговая сумма
        int i = 0;      // стартовое число ряда
        count = 20; // количество чисел
        while(i<=count) {
            i++;        // берем очередное число, i++ эквивалентно i=i+1
            if (i*i<=count)  // если квадрат числа меньше
                continue;   // количества чисел - сумму не считаем
            // переходим к следующему числу в цикле
            sum += i*i*i; // иначе считаем сумму кубов чисел
            System.out.println(sum);
        } // sum += i*i*i - форма записи, аналогичная sum = sum + i*i*i
        System.out.println(sum);// печатаем результат

        System.out.println(Math.round(4.49999999999999999));

        for(i = 0; i < 10; i++) {
            System.out.println(i);
            continue;
        }
    }
}