public class Main {


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        lesson1();
        System.out.println();
        lesson2();
        System.out.println();
        lesson3();
        System.out.println();
        lesson4();
    }


    private static void lesson1() {
        /*
        Первым делом бухгалтеры попросили посчитать
        сумму всех выплат за месяц.
        */
        int[] arr = generateRandomArray();

        int totalConsumptionMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            totalConsumptionMonth = totalConsumptionMonth + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalConsumptionMonth + " рублей");
    }

    private static void lesson2() {
            /*
             Следующая задача — найти минимальную
             и максимальную трату за день.
            */

        int[] arr = generateRandomArray();

        int topCons = arr[0];
        int bottomCons = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > topCons) {
                topCons = arr[i];
            }
            if (arr[i] < bottomCons) {
                bottomCons = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + bottomCons + " рублей. " +
                "Максимальная сумма трат за день составила " + topCons + " рублей");
    }

    private static void lesson3() {

        /*
        А теперь нам нужно понять, какую в среднем сумму
        наша компания тратила в течение данных 30 дней.
        */
        int[] arr = generateRandomArray();

        int median = 0;
        int totalConsumptionMonth = 0;

        for (int i = 0; i < arr.length; i++) {
            totalConsumptionMonth = totalConsumptionMonth + arr[i];
            if (i == arr.length - 1) {
                median = totalConsumptionMonth / arr.length;
                System.out.println("Средняя сумма трат за месяц составила " + median + " рублей.");
            }

        }

    }

    private static void lesson4() {
/*
        В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.O.
           сотрудников начали отображаться в обратную сторону;
        Напишите код, который в случае такого бага будет выводить Ф. И. О.
            сотрудников в корректном виде.
*/
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.print(reverseFullName[i - 1]);
        }
    }
}

