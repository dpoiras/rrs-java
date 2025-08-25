public class HW_2_1 {

    /* Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление и остаток от деления. Также сделать проверку на четность этих переменных и вывести результат. */

    public static void main(String[] args) {

        int a = 123;

        int b = 56;

        int sum = a + b;

        int product = a * b;

        int substraction = a - b;

        int division = a / b;

        int modulo = a % b;

        System.out.println();
        System.out.println("Сложение: a + b = " + sum);
        System.out.println("Умножение: a * b = " + product);
        System.out.println("Вычитание: a - b = " + substraction);
        System.out.println("Деление без остатка: a (double) / b = " + (a * 1.0 / b));
        System.out.println("Деление с остатком: a (int) / b = " + division);
        System.out.println("Остаток от деления: " + modulo);
        System.out.println();
        System.out.println("Чётные числа:");
        System.out.println("a - " + (a % 2 == 0));
        System.out.println("b - " + (b % 2 == 0));

    }
}
