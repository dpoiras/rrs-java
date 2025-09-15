package homework.hw6;

public class HW_6_9 {

    /*
    Вывести следующие строки с соответствующим форматированием (как пирамиды):

    0  1  2  3  4  5  6  7  8  9
      0  1  2  3  4  5  6  7  8
        0  1  2  3  4  5  6  7
          0  1  2  3  4  5  6
            0  1  2  3  4  5
              0  1  2  3  4
                0  1  2  3
                  0  1  2
                    0  1
                      0
     */

    public static void main(String[] args) {

        for (int i = 10; i > 0; i--) {
            for (int space = 10; space > i; space--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
