package homework.hw6;

public class HW_6_2 {

    /*
    У вас есть список адресов электронной почты.
    (1) Найдите все адреса с доменом gmail.com. Адреса поддельных сайтов типа myrealgmail.com не учитывать.
    Найти самый короткий (2) и самый длинный (3) адреса.
    (4) Проверить, нет ли адресов с юзернеймом admin

     */

    public static void main(String[] args) {

        String[] emails = {"ivan.petrov.dev@gmail.com",
                "anna.kuznetsova.qa@gmail.com",
                "dmitry_1989@gmail.com",
                "mikhail.ost_projects@gmail.com",
                "olga.design.notes@gmail.com",
                "sergey-data.lab@gmail.com",
                "kate.travel.blog@gmail.com",
                "admin@gmail.com",
                "nina.photo.work@gmail.com",
                "vlad.team.lead@gmail.com",
                "support@myrealgmail.com",
                "no-reply@gmail-secure-login.com",
                "billing@googlmail.com"};

        int longEmail = Integer.MIN_VALUE;
        int numberOfLongestEmail = 0;

        int shortEmail = Integer.MAX_VALUE;
        int numberOfShortestEmail = 0;

        for (int i = 0; i < emails.length; i++) {
            if (emails[i].endsWith("@gmail.com")) {
                System.out.println("1. Gmail address: " + emails[i]);
            }

            if (emails[i].length() > longEmail) {
                longEmail = emails[i].length();
                numberOfLongestEmail = i;
            }

            if (emails[i].length() < shortEmail){
                shortEmail = emails[i].length();
                numberOfShortestEmail = i;
            }

            if (emails[i].startsWith("admin@")) {
                System.out.println("\n4. There is an email with username admin: " + emails[i]);
            }
        }

        System.out.println("\n2. The shortest email is: " + emails[numberOfShortestEmail]);

        System.out.println("\n3. The longest email is: " + emails[numberOfLongestEmail]);

    }
}
