package lesson;

import java.util.Locale;

public class Lesson_6_3 {

    public static void main(String[] args) {

        String sentence = "Java is Impossible to leArn";

        System.out.println(sentence);

        String allVowels = "aeiouAeIOU";

        String result = "";

        int counter = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (allVowels.indexOf(c) > -1) {
                result = result + c;
                counter++;
            }
        }
        System.out.println("Vowels letters: " + result);
        System.out.println("Quantity: " + counter);
    }
}
