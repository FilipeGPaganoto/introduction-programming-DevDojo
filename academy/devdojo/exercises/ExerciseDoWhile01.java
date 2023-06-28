package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseDoWhile01 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int shouldContinue = 1;

        do {
            System.out.println("Input the first number: ");
            int numberOne = keyboard.nextInt();
            System.out.println("Input the second number: ");
            int numberTwo = keyboard.nextInt();

            System.out.println("Are the numbers equal? " + (numberOne == numberTwo));


            System.out.println("Would you like to continue?");
            System.out.println("1. Yes");
            System.out.println("2. No");

            shouldContinue = keyboard.nextInt();

        } while (shouldContinue == 1);
    }
}
