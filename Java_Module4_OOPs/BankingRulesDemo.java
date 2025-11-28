class Account {
    final String accountNumber = "ACC12345";   // cannot be changed

    final void bankPolicy() {  // cannot be overridden
        System.out.println("Bank policy: KYC mandatory.");
    }
}

final class CentralBankRules {  // cannot be inherited
    void showRules() {
        System.out.println("Central bank rules applied.");
    }
}

class SavingsAccount extends Account {
    // bankPolicy() cannot be overridden here
}

public class BankingRulesDemo {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.bankPolicy();

        CentralBankRules c = new CentralBankRules();
        c.showRules();
    }
}
