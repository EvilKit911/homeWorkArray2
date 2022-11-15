import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int amountPayments = 0;
        int[] arr = generateRandomArray();

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(i + " " + arr[i]);
            amountPayments += arr[i];
        }

        System.out.println("Сумма трат за месяц составила " + amountPayments + " рублей");

        System.out.println(' ');


        //задание 2
        //Следующая задача — найти минимальную и максимальную трату за день.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».

        int minimum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(minimum > arr[i] + 1){
                minimum = arr[i];
            }
        }


        System.out.println(" Минимальная сумма трат за день составила " + minimum + " рублей");

        System.out.println(' ');


        int maximum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (maximum < arr[i]) {
                maximum = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maximum + " рублей");

        System.out.println(' ');

        // задание 3

        //А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        //Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
        // и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».

        float summa1 = amountPayments; // перевод из целочисленных переменных в переменные с плавающей запятой
        float srednieZnachenie = summa1 / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + srednieZnachenie + " рублей");

        // задание 4

        System.out.println(' ');

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0;  i--) {      // i = количеству ячеек масива, пока i >= 0 цикл продолжается
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {

        Random random = new Random();
        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;




    }
}
