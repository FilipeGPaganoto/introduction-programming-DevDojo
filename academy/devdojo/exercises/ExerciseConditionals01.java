package academy.devdojo.exercises;

public class ExerciseConditionals01 {
    public static void main(String[] args) {
        double salary = 11000;
        double result;
        String percentageValue;

        if (salary > 5000) {
            result = (salary * 30) / 100;
            percentageValue = "30% = " + result;
        } else {
            result = (salary * 15) / 100;
            percentageValue = "15% = " + result;
        }

        System.out.println(percentageValue);
    }
}
