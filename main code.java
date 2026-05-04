 import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("===  Cyber Security Password Analyzer ===");
            System.out.println("Enter password to check: ");
            String password = input.nextLine();
            
            int score = 0;
            
            // Length Check
            if (password.length() >= 8) score++;
            if (password.length() >= 12) score++;
            
            if (password.matches(".*[0-9].*")) score++;
            
            if (password.matches(".*[A-Z].*")) score++;
            
            if (password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) score++;
            
            System.out.println("\nAnalyzing...");
            System.out.print("Strength: ");
            
            if (score <= 2) {
                System.out.println(" WEAK (Hackable in seconds!)");
            } else if (score <= 4) {
                System.out.println("MEDIUM (Good, but could be better)");
            } else {
                System.out.println("STRONG (Secure like a vault!)");
            }
        }
    }
}


    
