package lesson;

public class Lesson_7 {

    public static void main(String[] args) {

        int result = sum(5, 4);

        System.out.println(result);

        printNumber( 10);
        printText("Hello!");
        
    }

    public static void printNumber(int a) {
        System.out.println(a);
    }

    public static void printText(String text) {
        System.out.println(text);

    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
