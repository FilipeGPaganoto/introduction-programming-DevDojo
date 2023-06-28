package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseWhile03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String savedUsername = "Luffy";
        String savedPassword = "king";

        while (true) {
            System.out.println("Username: ");
            String inputUsername = input.nextLine();
            System.out.println("Password: ");
            String inputPassword = input.nextLine();

            if (inputUsername.equals(savedUsername) && inputPassword.equals(savedPassword)) {
                System.out.println("Access Granted");
                break;
            }

            System.out.println("Access Denied");

        }
    }
}
