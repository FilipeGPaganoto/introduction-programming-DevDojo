public class Conditionals06 {
    public static void main(String[] args) {
        float ps5Price = 500;
        double creditCardAvailableCredit = 50;
        double checkingAccountBalance = 400;
        double savingsAccountBalance = 250;

        if (creditCardAvailableCredit >= ps5Price || checkingAccountBalance >= ps5Price || savingsAccountBalance >= ps5Price) {
            System.out.println("You can buy it!");
        } else {
            System.out.println("Let's buy it next month!");
        }
    }
}
