package academy.devdojo.conditionals;

import java.util.Scanner;

public class Conditionals08 {
    public static void main(String[] args) {
        int day = 16;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
            default:
                System.out.println("[ERROR] Switch could not find your day, do you live on Moon?");
        }

        System.out.println("Finished");
    }
}
