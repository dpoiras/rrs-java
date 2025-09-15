package homework.hw6;

public class HW_6_4 {

    /*
    Возьмите массив из предыдущей задачи, и выведите в одну строку все числа,
    лежащие на его диагонали от верхнего левого угла до нижнего правого.
    В другой строке — числа на на другой диагонали, от верхнего правого до нижнего левого углов.

     */

    public static void main(String[] args) {
        int[][] array = {
                {3, 5, 7},
                {1, 4, 6},
                {9, 2, 8}
        };

        StringBuilder diagonal1 = new StringBuilder();
        StringBuilder diagonal2 = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            diagonal1.append(array[i][i]).append(" ");
            diagonal2.append(array[i][array.length - 1 - i]).append(" ");
        }

        System.out.println("Diagonal from top-left to bottom-right: " + diagonal1.toString().trim());
        System.out.println("Diagonal from top-right to bottom-left: " + diagonal2.toString().trim());

    }
}
