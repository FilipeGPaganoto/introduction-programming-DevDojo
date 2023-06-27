package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseConditionals05 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type your login name: ");
        String loginName = keyboard.next();


        /* while (loginName.trim().equals("") || loginName.toLowerCase().equals("admin") || loginName.toLowerCase().equals("administrator")) {
            System.out.println("Please, type a valid login name!");
            loginName = keyboard.next();
        }

        System.out.println(loginName + " was registered successfully!");

        A way to do this exercise by a better way, but since we are using conditionals, I commented this
        */

        if (loginName.trim().equals("") || loginName.toLowerCase().equals("admin") || loginName.toLowerCase().equals("administrator")) {
            System.out.println("Please, type a valid login name!");
            loginName = keyboard.next();
        } else {
            System.out.println(loginName + " was registered successfully");
        }
    }
}
