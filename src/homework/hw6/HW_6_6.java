package homework.hw6;

public class HW_6_6 {

    /*
    Дана строка:
    I’m just 16,
    going on	17!

    (перед 17 стоит Tab, а не пробел). В принципе, это может быть ЛЮБАЯ строка,
    содержащая латинские буквы в верхнем и нижнем регистре, цифры, знаки препинания.

    Найти, сколько в этой строке заглавных букв, сколько прописных, сколько гласных,
    сколько согласных, сколько цифр, сколько знаков препинания, сколько “пробельных” символов
    (в них входят пробелы, символы табуляции, перевод строки и пр. Поищите “whitespace characters”).

    Имейте в виду, что некоторые проверки можно делать легче, чем другие. Поэкспериментируйте.
     */

    public static void main(String[] args) {

        String str = "I’m just 16,\n" +
                "going on\t17!";
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int punctuationCount = 0;
        int whitespaceCount = 0;

        String vowels = "AEIOUaeiou";
        String punctuation = "~@#$%^&*()_-+=,.'\"!?;:[]{}<>";

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            }

            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            } else if (Character.isLetter(ch)) {
                consonantCount++;
            }

            if (Character.isDigit(ch)) {
                digitCount++;
            }

            if (punctuation.indexOf(ch) != -1) {
                punctuationCount++;
            }

            if (Character.isWhitespace(ch)) {
                whitespaceCount++;
            }
        }

        System.out.println("Uppercase letters: " + upperCaseCount);
        System.out.println("Lowercase letters: " + lowerCaseCount);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Punctuation marks: " + punctuationCount);
        System.out.println("Whitespace characters: " + whitespaceCount);

    }
}
