
public class Array2hw {
    public static void main(String[] args) {



        //Задача 1
        System.out.println(" ");

    int[] random = {
            101576,//0          гениратор масива со случайными числами у меня не заработал
            120453,//1
            140021,//2
            112300,//3
            166421,//4
            182002,//5
            101870,//6
            121002,//7
            176002,//8
            114760,//9
            103576,//10
            122453,//11
            146021,//12
            117300,//13
            167421,//14
            183002,//15
            101904,//16
            128002,//17
            175002,//18
            118760,//19
            104576,//20
            129453,//21
            142021,//22
            116300,//23
            168421,//24
            189002,//25
            195870,//26
            124002,//27
            178002,//28
            100760,//29             это самое глупое занятие...
                        };


    int summa = 0;

        for (int i = 0; i < random.length; i++) {
            summa = random[i] + summa;
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей");

        System.out.println(" ");

        //задание 2
        //Следующая задача — найти минимальную и максимальную трату за день.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».

    int minimum = random[0];

        for (int i = 0; i < random.length; i++) {
            if(minimum > random[i] + 1){
                minimum = random[i];
            }
        }

        System.out.println(" Минимальная сумма трат за день составила " + minimum + " рублей");

        System.out.println(' ');


        int maximum = random[0];

        for (int i = 0; i < random.length; i++) {
            if (maximum < random[i]) {
                maximum = random[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maximum + " рублей");

        System.out.println(' ');



        // задание 3

        //А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        //Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
        // и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».

        float summa1 = summa; // перевод из целочисленных переменных в переменные с плавающей запятой
        float srednieZnachenie = summa1 / random.length;
        System.out.println("Средняя сумма трат за месяц составила " + srednieZnachenie + " рублей");





    }
}
