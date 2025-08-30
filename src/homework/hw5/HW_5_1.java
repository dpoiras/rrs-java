package homework.hw5;

public class HW_5_1 {

    /* Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести сумму всех значений массива. */

    public static void main(String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }

        System.out.println("\ncумма всех значений массива = " + sum);

    }

}
