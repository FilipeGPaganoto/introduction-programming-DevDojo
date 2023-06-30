package academy.devdojo.arrays;

public class MultiArrays02 {
    public static void main(String[] args) {
        int[][] multiArray = new int[2][2];

        multiArray[0][0] = 10;
        multiArray[0][1] = 20;
        multiArray[1][0] = 30;
        multiArray[1][1] = 40;

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.println("[" + i + "] [" + j + "] " + multiArray[i][j]);
            }
        }
    }
}
