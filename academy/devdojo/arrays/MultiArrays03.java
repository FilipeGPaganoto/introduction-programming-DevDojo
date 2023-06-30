package academy.devdojo.arrays;

import java.util.Scanner;

public class MultiArrays03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] multiArray = new int[2][2];

        multiArray[0][0] = 10;
        multiArray[0][1] = 20;
        multiArray[1][0] = 30;
        multiArray[1][1] = 40;

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.println("[%d] [%d]".formatted(i, j));
                multiArray[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.printf("[%d] [%d] = %d%n", i, j, multiArray[i][j]);
            }
        }
    }
}
