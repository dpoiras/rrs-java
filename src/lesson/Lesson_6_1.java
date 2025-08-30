package lesson;

public class Lesson_6_1 {

    public static void main(String[] args) {

        int[][] steps = {
                {3500, 4000, 2700, -1234},
                {12, 45, 9000, 2222},
                {10000, 8500, 1, 55},
                {11111, -12, 8895, 245}
        };

        printArray(steps);
        System.out.println("———————————————————————");

        int maxStepsPerDay = 0;
        for (int i = 0; i < steps.length; i++) {
            int sum = 0;
            for (int j = 0; j < steps[i].length; j++) {
                sum += steps[i][j];
            }

            System.out.println("Steps per row " + (i + 1) + ": " + sum);

//            if (sum > maxStepsPerDay) {
//                maxStepsPerDay = sum;
//            }
        }

        System.out.println("———————————————————————\n ");

        for (int i = 0; i < steps[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < steps.length; j++) {
                sum += steps[j][i];
            }

            System.out.println("Sum per column " + (i + 1) + ": " + sum);
        }

//            —————————————————————————

//        System.out.println("Max steps: " + maxStepsPerDay);

//        int[][] matrix = new int[3][5];
//        printArray(matrix);
//        System.out.println("------------");
//
//        matrix[1][2] = -30;
//        matrix[1][4] = 2;
//        matrix[0][3] = 7;
//
//        printArray(matrix);
//        System.out.println("------------ ");
//
//        int[][] anotherArray = new int[1][4];
//        printArray(anotherArray);


//            ——————————————————————

        }

        static void printArray(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }


    }

