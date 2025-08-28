public class Lesson_4 {

    public static void main(String[] args) {

        int[] matchesInBoxes = {59, 60, 60, 58, 61, 60, 63, 61, 58, 58};
        for (int i = 0; i < matchesInBoxes.length; i = i + 1) {
            int matchesInCurrentBox = matchesInBoxes[i];
            if (matchesInCurrentBox != 60) {
                System.out.println("Box number " + i + " has " + matchesInCurrentBox + " matches");
            }
        }
    }
}
