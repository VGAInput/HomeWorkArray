public class Main {
    public static void main(String[] args) {

        lesson4();

    }

    private static void lesson1() {
        /*
            Объявите три массива:
        */

        {
            //Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3
            int[] nums = new int[]{1, 2, 3};

            //Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
            double[] dubs = new double[]{1.57, 7.654, 9.986};

            //Произвольный массив – тип и количество данных определите сами.
            float[] parametersRandom = new float[]{(float) Math.random(), (float) Math.random(), (float) Math.random()};
            float[] parmetersEmpty = new float[10];
        }
    }

    private static void lesson2() {
        /*
            Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
            начиная с первого элемента, через запятую. Запятая между последним элементом одного
            массива и первым элементом следующего не нужна.
         */

        int[] nums = new int[]{1, 2, 3};
        double[] dubs = new double[]{1.57, 7.654, 9.986};
        float[] parametersRandom = new float[]{(float) Math.random(), (float) Math.random(), (float) Math.random()};
        {
            for (int i = 0; i < nums.length; i++) {
                if (i == nums.length - 1) System.out.print(nums[i] + ". \n");
                else System.out.print(nums[i] + ", ");
            }
            for (int i = 0; i < dubs.length; i++) {
                if (i == dubs.length - 1) System.out.print(dubs[i] + ". \n");
                else System.out.print(dubs[i] + ", ");
            }
            for (int i = 0; i < parametersRandom.length; i++) {
                if (i == parametersRandom.length - 1) System.out.print(parametersRandom[i] + ". \n");
                else System.out.print(parametersRandom[i] + ", ");
            }
        }

    }

    private static void lesson3() {
        /*
            Теперь ваша задача – распечатать все элементы всех трех массивов,
            но начинать нужно не с первого элемента массива, а с последнего.
        */

        int[] nums = new int[]{1, 2, 3};
        double[] dubs = new double[]{1.57, 7.654, 9.986};
        float[] parametersRandom = new float[]{10.25f, 9.25f, 8.25f, 7.25f, 6.25f, 5.25f, 4.25f, 3.25f, 2.25f, 1.25f};
        {
            for (int i = nums.length; i >= 1; i--) {
                if (i == 1) System.out.print(nums[i - 1] + ". \n");
                else System.out.print(nums[i - 1] + ", ");
            }
            for (int i = dubs.length; i >= 1; i--) {
                if (i == 1) System.out.print(dubs[i - 1] + ". \n");
                else System.out.print(dubs[i - 1] + ", ");
            }
            for (int i = parametersRandom.length; i >= 1; i--) {
                if (i == 1) System.out.print(parametersRandom[i - 1] + ". \n");
                else System.out.print(parametersRandom[i - 1] + ", ");
            }
        }

    }

    private static void lesson4() {

        /*
            Пройдитесь по первому целочисленному массиву и все нечетные числа
            в нем сделайте четными (нужно прибавить 1).
        */

        int[] nums = new int[25];

        // Заполнение массива
        for (int i = 0; i < nums.length; i++){
            nums[i]=i;
            if (i == nums.length-1)System.out.print(nums[i] + ".\n");
                else System.out.print(nums[i] + ", ");
        }

        // Нечётные числа в чётные
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) System.out.print(nums[i] + ", ");
            else {
                nums[i] = nums[i+1];
                System.out.print(nums[i] + ", ");
            }
        }

    }
}