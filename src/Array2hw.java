
public class Array2hw {
    public static void main(String[] args) {



        //Задача 1
        System.out.println(" ");

    int[] random = {
            100576,//0          гениратор масива со случайными числами у меня не заработал
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
            105870,//16
            128002,//17
            175002,//18
            118760,//19
            104576,//20
            129453,//21
            142021,//22
            116300,//23
            168421,//24
            189002,//25
            105870,//26
            124002,//27
            178002,//28
            112760,//29             это самое глупое занятие...
                        };


    int summa = 0;

        for (int i = 0; i < random.length; i++) {
            summa = random[i] + summa;
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей");
    }
}
