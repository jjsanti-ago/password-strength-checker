import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("     PASSWORD STRENGTH CHECKER");
        System.out.println("=================================");

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        int score = 0;

        // Length
        if (password.length() >= 8) {
            score++;
        }

        // Uppercase letter
        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        // Lowercase letter
        if (password.matches(".*[a-z].*")) {
            score++;
        }

        // Number
        if (password.matches(".*[0-9].*")) {
            score++;
        }

        // Special character
        if (password.matches(".*[^a-zA-Z0-9].*")) {
            score++;
        }

        System.out.println();

        if (score <= 2) {
            System.out.println("Strength: WEAK");
        } else if (score <= 4) {
            System.out.println("Strength: MODERATE");
        } else {
            System.out.println("Strength: STRONG");
        }

        System.out.println("Score: " + score + "/5");

        scanner.close();
    }
}
