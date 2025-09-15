package lesson;

public class Lesson_7_1 {

    public static void main(String[] args) {

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] humidityValues = {60, 35, 49, 61, 63, 30, 66};

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < humidityValues.length; i++) {
            if (humidityValues[i] < firstMin) {
                secondMin = firstMin;
                secondIndex = firstIndex;
                firstMin = humidityValues[i];
                firstIndex = i;
            } else if (humidityValues[i] < secondMin) {
                secondMin = humidityValues[i];
                secondIndex = i;
            }
        }
        System.out.println();
        System.out.println("The most dry day is " + daysOfWeek[firstIndex] + ": " + firstMin);
        System.out.println("The second dry day is " + daysOfWeek[secondIndex] + ": " + secondMin);

    }
}