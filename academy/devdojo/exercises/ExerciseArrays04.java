package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseArrays04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array01 = new int[3];
        int[] array02 = new int[3];
        int[] array03 = new int[3];

        String resultArray3 = "";

        for (int i = 0; i < array01.length; i++) {
            System.out.println("Array 1 " + i);
            array01[i] = input.nextInt();

            System.out.println("Array 2 " + i);
            array02[i] = input.nextInt();

            array03[i] = array01[i] * array02[i];

            System.out.println(array03[i] + " ");

            resultArray3 = resultArray3 + array03[i] + " ";
        }

        System.out.println(resultArray3);
    }
}
