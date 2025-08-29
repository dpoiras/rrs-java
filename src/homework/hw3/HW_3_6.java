package homework.hw3;

public class HW_3_6 {

    /* Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
Реализовать 2 варианта:
использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
без использования конструкции if (шаг цикла на ваше усмотрение). */

    public static void main(String[] args) {

        System.out.println("Вариант 1 (с использованием if):");
        for (int i = 40; i <= 60; i = i + 1) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Вариант 2 (без использования if):");
        for (int i = 40; i <= 60; i = i + 4) {
            System.out.println(i);
        }
    }

}
