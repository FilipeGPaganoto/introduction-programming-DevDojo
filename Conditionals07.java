public class Conditionals07 {
    public static void main(String[] args) {
        float income = 12000.0F;

        if (income <= 9950) {
            System.out.println("10% = " + (income * 10) / 100);
        } else if (income >= 9551 && income <= 40525) {
            System.out.println("12% = " + (income * 12) / 100);
        } else if (income >= 40526 && income <= 86375) {
            System.out.println("22% = " + (income * 22) / 100);
        } else {
            System.out.println("30% = " + (income * 30) / 100);
        }
    }
}
