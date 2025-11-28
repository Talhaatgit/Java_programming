// Demonstrates encapsulation with input validation in setter

class Account {
    private int balance;

    // Setter method with validation
    public void setBalance(int amount) {
        if (amount > 0) {
            balance = amount;
        } else {
            System.out.println("Invalid amount! Balance cannot be negative or zero.");
        }
    }

    // Getter method
    public int getBalance() {
        return balance;
    }
}

public class Encapsulation_WithValidation {
    public static void main(String[] args) {
        Account a = new Account();
        a.setBalance(5000);
        System.out.println("Account Balance: " + a.getBalance());

        a.setBalance(-2000); // invalid input
    }
}
