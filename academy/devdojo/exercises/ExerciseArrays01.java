package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseArrays01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many grades would you like to input? ");
        int gradesAmount = input.nextInt();

        double[] grades = new double[gradesAmount];

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade " + (i + 1) + ": ");
            grades[i] = input.nextDouble();
        }

        double gradesSum = 0;
        for (int i = 0; i < gradesAmount; i++) {
            gradesSum = gradesSum + grades[i];
        }

        System.out.println("The average of a total of " + gradesAmount + " notes is: " + (gradesSum / gradesAmount));
    }
}
