import java.util.Scanner;

public class OnlinePaymentSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double paymentAmount = scanner.nextDouble();
        scanner.nextLine(); // Consume the pending newline

        String paymentType = scanner.nextLine();

        if("boleto".equalsIgnoreCase(paymentType))
        {
            processBoletoPayment();
        }
        else if("credit_card".equalsIgnoreCase(paymentType))
        {
            processCreditCardPayment(scanner);
        }
        else
        {
            System.out.println("Unrecognized payment type.");
        }
    }
    private static void processBoletoPayment() {
        System.out.println("The payment with boleto was processed successfully.");
    }

    private static void processCreditCardPayment(Scanner scanner) {
        String cardNumber = scanner.nextLine();

        String expirationDate = scanner.nextLine();

        String securityCode = scanner.nextLine();

        String cardholderName = scanner.nextLine();

        // Here, you can add the credit card payment processing logic
        // If needed, you can validate the card details and perform the actual payment

        System.out.println("The payment with credit card was processed successfully.");
    }
}