package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseWhile02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte option = 0;

        while (option != 3) {
            System.out.println("1. Calculate taxes");
            System.out.println("2. Deposit money");
            System.out.println("3. Calculate taxes");
            option = input.nextByte();
        }

        System.out.println("Program Finished");
    }
}
