import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount to be converted: ");
        double amount = input.nextDouble();

        System.out.print("Enter the currency to be converted from: ");
        String fromCurrency = input.next();

        System.out.print("Enter the currency to be converted to: ");
        String toCurrency = input.next();

        double usdToInr = 81.79;
        double eurToInr = 90.12;
        double gbpToInr = 103.33;

        double convertedAmount = 0;

        switch (fromCurrency.toUpperCase()) {
            case "USD":
                convertedAmount = amount * usdToInr;
                break;
            case "EUR":
                convertedAmount = amount * eurToInr;
                break;
            case "GBP":
                convertedAmount = amount * gbpToInr;
                break;
            default:
                System.out.println("Invalid currency");
                System.exit(0);
        }

        switch (toCurrency.toUpperCase()) {
            case "INR":
                System.out.println(amount + " " + fromCurrency + " is equal to " + convertedAmount + " INR");
                break;
            default:
                System.out.println("Invalid currency");
        }
    }
}
