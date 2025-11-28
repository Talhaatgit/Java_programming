// Real-world class to represent a bank account

class BankAccount {
    String holderName;
    double balance;

    void openAccount(String name, double initialDeposit) {
        holderName = name;
        balance = initialDeposit;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void display() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Current Balance: " + balance);
    }
}

public class RealWorld_BankAccount {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.openAccount("Aisha", 2000);
        acc.deposit(1500);
        acc.display();
    }
}
