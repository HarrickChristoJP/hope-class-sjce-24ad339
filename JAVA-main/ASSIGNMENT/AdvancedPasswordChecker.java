import java.util.*;

public class AdvancedPasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int score = 0;

        // Length scoring
        if (password.length() >= 8) score++;
        if (password.length() >= 12) score++;
        if (password.length() >= 16) score++;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }

        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;
        if (hasSpecial) score++;

        // Weak patterns check
        String lower = password.toLowerCase();
        if (lower.contains("123") || lower.contains("password") || lower.contains("abc")) {
            score -= 2;
        }

        // Repeated characters penalty
        for (int i = 0; i < password.length() - 2; i++) {
            if (password.charAt(i) == password.charAt(i+1) &&
                password.charAt(i) == password.charAt(i+2)) {
                score -= 1;
                break;
            }
        }

        // Final result
        System.out.println("\nPassword Score: " + score);

        if (score <= 3) {
            System.out.println("Strength: VERY WEAK ❌");
        } else if (score <= 5) {
            System.out.println("Strength: WEAK ⚠️");
        } else if (score <= 7) {
            System.out.println("Strength: MEDIUM 👍");
        } else {
            System.out.println("Strength: STRONG 💪🔥");
        }

        // Suggestions
        System.out.println("\nSuggestions:");
        if (!hasUpper) System.out.println("- Add uppercase letters");
        if (!hasLower) System.out.println("- Add lowercase letters");
        if (!hasDigit) System.out.println("- Add numbers");
        if (!hasSpecial) System.out.println("- Add special characters");
        if (password.length() < 12) System.out.println("- Increase length (12+ recommended)");

        sc.close();
    }
}