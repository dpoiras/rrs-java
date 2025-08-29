package homework.hw4;

public class HW_4_7 {

    /* Имеется 20 коробок спичек. Найти все коробки, количество спичек в которых отличается от среднего количества больше, чем на 3. Например, если есть следующие данные:
    60, 59, 58, 59, 64, 60,
    то среднее количество будет чуть меньше 60. Соответственно, коробка с 64 спичками будет сильно отличаться от среднего. */

    public static void main(String[] args) {

        int[] boxes = {60, 59, 58, 59, 64, 60, 57, 62, 61, 63, 65, 58, 59, 60, 61, 62, 63, 64, 65, 66};

        int sum = 0;
        for (int box : boxes) {
            sum += box;
        }

        double average = (double) sum / boxes.length;
        System.out.println("Среднее количество спичек: " + average);

        System.out.println("Коробки с количеством спичек, отличающимся от среднего более чем на 3:");
        for (int i = 0; i < boxes.length; i++) {
            if (Math.abs(boxes[i] - average) > 3) {
                System.out.println("Коробка " + (i + 1) + ": " + boxes[i] + " спичек");
            }
        }
    }
}
