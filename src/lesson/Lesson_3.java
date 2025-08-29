package lesson;

public class Lesson_3 {

    public static void main(String[] args) {

        int x = 10;
        if  (x > 5) {
            System.out.println("x больше 5");
        } else if (x < 5) {
            System.out.println("x меньше 5");
        } else {
            System.out.println("x равно 5");
        }
        System.out.println("Конец программы");

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Число " + i + " четное");
            } else {
                System.out.println("Число " + i + " нечетное");
            }
        }

        while (x < 20) {
            System.out.println("x меньше 20, текущее значение: " + x);
            x++;
        }

        do {
            System.out.println("x все еще меньше 20, текущее значение: " + x);
            x++;
        } while (x < 25);
        System.out.println("Цикл do-while завершен, текущее значение x: " + x);

    }
}
