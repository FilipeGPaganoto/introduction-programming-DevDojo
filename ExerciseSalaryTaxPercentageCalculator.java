public class ExerciseSalaryTaxPercentageCalculator {
    public static void main(String[] args) {
        float salary = 4900.0F;
        float taxPercentage = 30;
        float taxAmountFromSalary = salary * (taxPercentage / 100);;
        System.out.println(taxAmountFromSalary);
    }
}
