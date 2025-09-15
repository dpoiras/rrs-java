package homework.hw6;

public class HW_6_1 {

    /*
    Вы ведете записи наивысшей дневной температуры.
    Найдите самый жаркий день. Найдите второй самый жаркий.
    Предполагается, что во все дни температура разная.
     */

    public static void main(String[] args) {

        int[] temp = {34, 23, 47, 32, 33, 27, 35, 47};

        int tempMax1 = Integer.MIN_VALUE;
        int tempMax2 = Integer.MIN_VALUE;

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > tempMax1) {
                tempMax1 = temp[i];
            }
        }

        System.out.println("Maximum temperature: " + tempMax1);

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > tempMax2 && temp[i] < tempMax1) {
                tempMax2 = temp[i];
            }
        }

        System.out.println("Next maximum temperature: " + tempMax2);

    }
}
