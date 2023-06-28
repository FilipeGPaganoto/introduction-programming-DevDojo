package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseWhile01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type a number: ");
        int finalValue = input.nextInt();
        int i = 0;

        while (i < finalValue) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
