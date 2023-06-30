package academy.devdojo.exercises;

public class ExerciseMultiArrays01 {
    public static void main(String[] args) {
        int[][] array01 = new int[3][3];

        int trace = 0;

        array01[0][0] = 1;
        array01[0][1] = 2;
        array01[0][2] = 3;
        array01[1][0] = 4;
        array01[1][1] = 5;
        array01[1][2] = 6;
        array01[2][0] = 7;
        array01[2][1] = 8;
        array01[2][2] = 9;

        for (int i = 0; i < array01.length; i++) {
            for (int j = 0; j < array01[i].length; j++) {
                if (i == j) {
                    trace += array01[i][j];
                }
            }
        }
        System.out.printf("The trace is %d", trace);
    }
}
