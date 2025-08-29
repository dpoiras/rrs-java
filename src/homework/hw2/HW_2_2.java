package homework.hw2;

public class HW_2_2 {

    /* Необходимо создать целочисленные переменные a и b, присвоить им произвольные значения, а потом поменять значения местами (значение переменной a должно оказаться в переменной b и наоборот). */

    public static void main(String[] args) {

        int a = 7;

        int b = 3;

        System.out.println("Было a = " + a);
        System.out.println("Было b = " + b);

        int temp = a;

        a = b;

        b = temp;

        System.out.println("Стало a = " + a);
        System.out.println("Стало b = " + b);
    }
}
