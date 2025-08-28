import java.util.Arrays;

public class Lesson_4 {

    public static void main(String[] args) {


//      массивы - это объекты, которые хранят в себе набор однотипных данных

//      ——————————————————————————————————————————————————————————————

        System.out.println();
        System.out.println("——————————————————————————————————————————————————————————————");
        System.out.println();


        int a = 0;

        int[] matchesInBoxes = {59, 60, 60, 58, 61, 60, 63, 61, 58, 58};

        int[] deltas = new int[matchesInBoxes.length];

        for (int i = 0; i < matchesInBoxes.length; i++) {
            int matchesInCurrentBox = matchesInBoxes[i];
            deltas[i] = 60 - matchesInCurrentBox;
        }

        System.out.println(Arrays.toString(matchesInBoxes));
        System.out.println(Arrays.toString(deltas));



        System.out.println();
        System.out.println("——————————————————————————————————————————————————————————————");
        System.out.println();



        int[] a = { 10, 11, 12 };
        int[] b = Arrays.copyOf(a, a.length);
        System.out.println("Before change:");
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));

        a[0] = 110;
        System.out.println("After change:");
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));



        System.out.println();
        System.out.println("——————————————————————————————————————————————————————————————");
        System.out.println();



        String str = "буря мглою небо кроет";
        System.out.println(Arrays.toString(str.split(" ")));

        System.out.println(String.join("++", "a", "b", "c", "d"));

        System.out.println("a" + "b" + "c" + "d");




//      стриннги

//      ——————————————————————————————————————————————————————————————


        System.out.println();
        System.out.println("——————————————————————————————————————————————————————————————");
        System.out.println();




        String str = "10dfjjejf";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }



        System.out.println();
        System.out.println("——————————————————————————————————————————————————————————————");
        System.out.println();



        String str = "abc";
        String str2 = new String(new char[] {'a', 'b', 'c'});

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str == str2);
        System.out.println(str.equals(str2));



        System.out.println();
        System.out.println("——————————————————————————————————————————————————————————————");
        System.out.println();



        String str = "aAbcdefgABCDEFG";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(str.substring(str.length() - 3));
        System.out.println(str.substring(1, 6));

        System.out.println(str.indexOf('A'));
        System.out.println(str.lastIndexOf('A'));
        System.out.println(str.indexOf("ABC"));

        System.out.println(str.contains("ABCX"));
        System.out.println(str.contains("ABC"));

        System.out.println(str.startsWith("a"));
        System.out.println(str.endsWith("z"));

        System.out.println(str.replace('A', 'X'));
        System.out.println(str);


    }
}
