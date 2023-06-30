package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseArrays03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array01 = new int[3];
        int[] array02 = new int[3];
        int[] array03 = new int[3];

        for (int i = 0; i < array01.length; i++) {
            System.out.println("Array 1 " + i);
            array01[i] = input.nextInt();
        }

        for (int i = 0; i < array02.length; i++) {
            System.out.println("Array 2 " + i);
            array02[i] = input.nextInt();
        }

        for (int i = 0; i < array03.length; i++) {
            array03[i] = array01[i] * array02[i];
            System.out.println("The multiplication is between " + array01[i] + " x " + array02[i] + " is: " + array03[i]);
        }
    }
}
