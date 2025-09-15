package homework.hw6;

public class HW_6_5 {

    /*
    Возьмите массив из предыдущей задачи, или любой другой квадратный массив (матрицу). Зеркально преобразуйте его вокруг диагонали от верхнего левого до нижнего правого угла. Например, если был массив
    3 5 7
    1 4 6
    9 2 8

    то после преобразования он должен выглядеть так:
    3 1 9
    5 4 2
    7 6 8
     */

    public static void main(String[] args) {

        int[][] array = {
                {3, 5, 7},
                {1, 4, 6},
                {9, 2, 8}
        };

        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}
