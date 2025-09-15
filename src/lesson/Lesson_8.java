package lesson;

import java.util.Arrays;

public class Lesson_8 {

    public static void main(String[] args) {

        int[] temps = {28, 30, 25, 31, 18, 22};
        System.out.println(Arrays.toString(getTwoHottestsDays(temps)));

    }

    public static int[] getTwoHottestsDays(int[] temps) {

        int hottest = Integer.MIN_VALUE;
        int secondHottest = Integer.MIN_VALUE;

        for (int i = 0; i < temps.length; i++) {

            int currentDayTemp = temps[i];
            if (currentDayTemp > hottest) {
                secondHottest = hottest;
                hottest = currentDayTemp;
            } else if (currentDayTemp > secondHottest) {
                secondHottest = currentDayTemp;
            }
        }
        return new int[] {hottest, secondHottest};
    }
}
