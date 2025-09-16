package homework.hw7;

    /*
    Необходимо написать 4 метода:
    сложение 2х чисел
    вычитание 2х чисел
    умножение 2х чисел
    деление 2х чисел
     */

public class HW_7_1 {

    public static void main(String[] args) {

        System.out.println(sum(15, 5));
        System.out.println(minus(30, 10));
        System.out.println(mult(2, 10));
        System.out.println(dev(60, 3));

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int dev(int a, int b) {
        return a / b;
    }

}
