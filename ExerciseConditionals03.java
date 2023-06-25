public class ExerciseConditionals03 {
    public static void main(String[] args) {
        int age = -1;
        String category;

        if (age < 13) {
            category = "Kid";
        } else if (age >= 13 && age <= 16) {
            category = "Juvenile";
        } else {
            category = "adult";
        }

        System.out.println("Your category, based in your age: " + age + ", is " + category);
    }
}
