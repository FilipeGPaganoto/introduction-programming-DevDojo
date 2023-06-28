package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseFor02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println( i + " x " + num + " = " + (i * num));
        }
    }
}
