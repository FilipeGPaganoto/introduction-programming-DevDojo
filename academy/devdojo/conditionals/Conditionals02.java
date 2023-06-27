package academy.devdojo.conditionals;

public class Conditionals02 {
    public static void main(String[] args) {
        float salaryManager = 5000;
        float salaryDeveloper = 4500;

        boolean isSalaryManagerGreaterThanDeveloper = salaryManager > salaryDeveloper;
        boolean isSalaryManagerGreaterOrEqualThanDeveloper = salaryManager >= salaryDeveloper;

        boolean isSalaryManagerLowerThanDeveloper = salaryManager < salaryDeveloper;
        boolean isSalaryManagerLowerOrEqualThanDeveloper = salaryManager <= salaryDeveloper;

        boolean isSalaryManagerEqualsDeveloper = salaryManager == salaryDeveloper;
        boolean isSalaryManagerDifferentThanDeveloper = salaryManager != salaryDeveloper;

        System.out.println("is Salary Maneger Greater Than Developer: " + isSalaryManagerGreaterThanDeveloper);
        System.out.println("is Salary Maneger Greater Or Equal Than Developer: " + isSalaryManagerGreaterOrEqualThanDeveloper);
        System.out.println("is Salary Maneger Lower Than Developer: " + isSalaryManagerLowerThanDeveloper);
        System.out.println("is Salary Maneger Lower Or Equal Than Developer: " + isSalaryManagerLowerOrEqualThanDeveloper);
        System.out.println("is Salary Maneger Equals Developer: " + isSalaryManagerEqualsDeveloper);
        System.out.println("is Salary Maneger Different Than Developer: " + isSalaryManagerDifferentThanDeveloper);
    }
}
