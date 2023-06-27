package academy.devdojo.conditionals;

public class Conditionals05 {
    public static void main(String[] args) {
        String savedName = "Aatrox";
        String savedCreditCardNumber = "123";
        String savedSecurityCode = "303";

        String inputName = "Aatrox";
        String inputCreditCardNumber = "123";
        String inputSecurityCode = "303";

        if (savedName.equals(inputName) && savedCreditCardNumber.equals(inputCreditCardNumber) && savedSecurityCode.equals(inputSecurityCode)) {
            System.out.println("Can buy!");
        } else {
            System.out.println("Can't buy!");
        }
    }
}
