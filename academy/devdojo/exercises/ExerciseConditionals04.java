package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseConditionals04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please, type your age to find your category: ");
        int age = input.nextInt();
        String category;

        if (age < 13) {
            category = "Kid";
        } else if (age >= 13 && age <= 16) {
            category = "Juvenile";
        } else {
            category = "adult";
        }

        System.out.println("Your category, based in your age: " + age + ", is " + category);
    }
}
