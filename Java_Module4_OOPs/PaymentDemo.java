class Payment {
    void pay() {
        System.out.println("Processing generic payment");
    }
}

class CreditCardPayment extends Payment {
    void pay() {
        System.out.println("Paid using Credit Card");
    }
}

class UPIPayment extends Payment {
    void pay() {
        System.out.println("Paid using UPI");
    }
}

class NetBankingPayment extends Payment {
    void pay() {
        System.out.println("Paid using Net Banking");
    }
}

public class PaymentDemo {
    static void processPayment(Payment p) {
        p.pay();   // polymorphism makes it easy to add new types
    }

    public static void main(String[] args) {
        processPayment(new CreditCardPayment());
        processPayment(new UPIPayment());
        processPayment(new NetBankingPayment());
    }
}
