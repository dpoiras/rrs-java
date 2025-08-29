package homework.hw5;

public class HW_5_4 {

    /* Дан массив:
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    необходимо вывести среднее арифметическое всех значений массива. */

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
                sum += array[i];
        }

        int middle = sum / array.length;

        System.out.println(middle);

    }
}
