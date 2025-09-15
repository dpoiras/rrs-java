package lesson.Lesson_8_1;

public class Main {

    /*
    Common Conversion Types
    Specifier Use-case
    %s String
    %d Decimal integer
    %f Floating-point (supports precision)
    $e Scientific notation
    %x/%X Hexadecimal integer
    %o Octal output
    %c Single character
    %b Boolean or general
    %t/%T Date/time formatting
    %% Literal percent character
     */

    public static void main(String[] args) {

        String car_make = "Ford";
        String car_model = "F-150";
        int car_year = 2011;
        String car_color = "Blue";

        Car blueF150 = new Car();
        System.out.printf("car: %s %s %d %s\n", car_make, car_model, car_year, car_color);


    }
}
