import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println ("Задача 1");
        int summa = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            summa = summa + arr[i];
        }
        System.out.println("Сумма всех выплат за месяц: " + summa);

        //Задача 2
        System.out.println("Задача 2");
        int max = -1;
        int min = 214748347;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " +
                min + " рублей. Максимальная сумма трат за день составила " + max + " рублей." );

        //Задача 3
        System.out.println("Задача 3");
        double medium = summa / 30;
        System.out.println("Средняя сумма трат за месяц составила " + medium + " рублей.");

        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i --){
            System.out.print (reverseFullName[i]);
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