package academy.devdojo.arrays;

public class Arrays02 {
    public static void main(String[] args) {
        String[] names = new String[3];

        names[0] = "Aatrox";
        names[1] = "Camille";
        names[2] = "Gnar";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
