package homework.hw6;

public class HW_6_10 {

    /*
    Вывести следующие строки с соответствующим форматированием (как пирамиды):

    9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
      8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
        7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
          6 5 4 3 2 1 0 1 2 3 4 5 6
            5 4 3 2 1 0 1 2 3 4 5
              4 3 2 1 0 1 2 3 4
                3 2 1 0 1 2 3
                  2 1 0 1 2
                    1 0 1
                      0
     */

    public static void main(String[] args) {
        int n = 10;

        for (int i = n; i > 0; i--) {
            for (int space = n; space > i; space--) {
                System.out.print("  ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
