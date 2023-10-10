import java.util.Scanner;

public class EnvioEmails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String command = scanner.nextLine();

            if ("Send".equalsIgnoreCase(command)) {
                if (scanner.hasNextLine()) {
                    String recipient = scanner.nextLine();
                    if (scanner.hasNextLine()) {
                        String message = scanner.nextLine();
                        sendEmail(recipient, message);
                    } else {
                        System.out.println("Empty Inbox.");
                    }
                } else {
                  System.out.println("Empty Inbox.");
                }
            } else if ("Receive".equalsIgnoreCase(command)) {
                receiveEmail();
            } else {
                System.out.println("Invalid Command.");
            }
        
    }

    private static void sendEmail(String recipient, String message) {
        System.out.println("Email sent to " + recipient + " successfully!");
    }

    private static void receiveEmail() {
        System.out.println("Empty Inbox.");
    }
}