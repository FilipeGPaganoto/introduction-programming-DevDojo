package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseArrays02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many grades would you like to input? ");
        int gradesAmount = input.nextInt();

        double[] grades = new double[gradesAmount];

        double gradesSum = 0;
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade " + (i + 1) + ": ");
            grades[i] = input.nextDouble();
            gradesSum = gradesSum + grades[i];
        }

        System.out.println("The average of a total of " + gradesAmount + " notes is: " + (gradesSum / gradesAmount));
    }
}
