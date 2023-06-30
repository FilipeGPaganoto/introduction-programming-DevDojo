package academy.devdojo.arrays;

public class MultiArrays01 {
    public static void main(String[] args) {
        int[][] array01 = new int[2][3];

        array01[0][0] = 1;
        array01[0][1] = 2;
        array01[0][2] = 3;
        array01[1][0] = 4;
        array01[1][1] = 5;
        array01[1][2] = 6;

        System.out.println(array01[0][0]);
        System.out.println(array01[0][1]);
        System.out.println(array01[0][2]);
        System.out.println(array01[1][0]);
        System.out.println(array01[1][1]);
        System.out.println(array01[1][2]);
    }
}
