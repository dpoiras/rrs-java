package lesson;

public class Lesson_6_2 {

    public static void main(String[] args) {

        String sentence = "Java is impossible to learn";
        String[] words = sentence.split(" ");

        int maxLength = 0;
        int longestWorldIndex = -1;

        for (int i = 0; i < words.length; i++) {
            if (maxLength < words[i].length()) {
                maxLength = words[i].length();
                longestWorldIndex = i;
            }
        }
        if (longestWorldIndex > -1) {
            System.out.println(words[longestWorldIndex]);
        } else {
            System.out.println("Cannot find the longest word in an empty statement");
        }
    }
}
