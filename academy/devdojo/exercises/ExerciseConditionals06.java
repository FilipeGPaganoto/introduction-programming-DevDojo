package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseConditionals06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type your gender. M for male or F for female:");
        char gender = input.next().toUpperCase().charAt(0);

        if (gender != 'M' && gender != 'F') {
            System.out.println("Invalid gender");
            System.exit(0);
        }

        System.out.println("Type your age: ");
        int age = input.nextInt();

        if (age < 18) {
            System.out.println("Service not allowed for people under 18");
        }

        if (gender == 'M' && age >= 18) {
            System.out.println("Mandatory Service");
        } else if (gender == 'F' && age >= 18) {
            System.out.println("Would you like to enlist?");
        }


    }
}
