package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseConditionals07 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type the number [1...7] of the day of the week:");
        int day = keyboard.nextInt();

        switch (day) {
            case 2, 3, 4, 5, 6 -> System.out.println("Weekday! Go work");
            case 1, 7 -> System.out.println("Weekend! Let's rest");
            default -> System.out.println("Invalid day! Are you an idiot??");
        }
    }
}
