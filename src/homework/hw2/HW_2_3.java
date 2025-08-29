package homework.hw2;

public class HW_2_3 {

    /* Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу корабля, половина оставшегося — капитану, остальное делится поровну между всеми членами команды, включая капитана.

    Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.

Вывести на экран кому сколько пиастров полагается
Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему? */

    public static void main(String[] args) {

        int peso = 4233;

        int pirates = 37;

        int owner = peso / 2;

        int captain = owner / 2;

        int pesoPerPirate = captain / pirates;

        System.out.println("Добыча составляет " + peso + " пиастр.");
        System.out.println("На борту " + pirates + " пиратов.");
        System.out.println("Владелец корабля получит " + owner + " пиастр.");
        System.out.println("Капитан получит " + captain + " пиастр.");
        System.out.println("Каждый член команды получит " + pesoPerPirate + " пиастр.");
        System.out.println("Капитан Джек Воробей получит " + (owner + captain + pesoPerPirate) + " пиастр.");
        System.out.println("Остаток в сундуке: " + (captain % pirates));

    }
}
