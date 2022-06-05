public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("    " + arr[i]);
        }
        System.out.println();

        // Задание 1.
        int summaMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            summaMonth = summaMonth + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + summaMonth + " рублей");

        // Задание 2.
        int minimumSum = arr[0];
        int maximumSum = arr[0];
        for (final int minimum : arr) {
            if (minimum < minimumSum) {
                minimumSum = minimum;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (maximumSum < arr[i]) {
                maximumSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimumSum + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maximumSum + " рублей");

        // Задание 3.
        double averageAmountDay = (double) summaMonth / 30;
        System.out.println("Средняя сумма трат за месяц составила " +averageAmountDay + " рублей");

        //задача 4.
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v' , 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    }


