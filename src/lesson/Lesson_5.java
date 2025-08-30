package lesson;

public class Lesson_5 {

    public static void main(String[] args) {

        String s = "Live long and prosper";

        char[] chars = s.toLowerCase().toCharArray(); // преобразовать в массив

        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        for (char c : chars) {
            if (c == 'a') {
                countA++;
            } else if (c == 'e') {
                countE++;
            } else if (c == 'i') {
                countI++;
            } else if (c == 'o') {
                countO++;
            } else if (c == 'u') {
                countU++;
            }
        }

        System.out.println("\nГласная A встречается в выражении " + countA + " раз");
        System.out.println("\nГласная E встречается в выражении " + countE + " раз");
        System.out.println("\nГласная I встречается в выражении " + countI + " раз");
        System.out.println("\nГласная O встречается в выражении " + countO + " раз");
        System.out.println("\nГласная U встречается в выражении " + countU + " раз");


//        if (countA != 0) {
//            System.out.println("\nГласная A встречается в выражении " + countA + " раз");
//        }
//        if (countE != 0) {
//            System.out.println("\nГласная E встречается в выражении " + countE + " раз");
//        }
//        if (countI != 0) {
//            System.out.println("\nГласная I встречается в выражении " + countI + " раз");
//        }
//        if (countO != 0) {
//            System.out.println("\nГласная O встречается в выражении " + countO + " раз");
//        }
//        if (countU != 0) {
//            System.out.println("\nГласная U встречается в выражении " + countU + " раз");
//        } else {
//            System.out.println("\nГласная U встречается в выражении " + countU + " раз");
//        }


    }
}
