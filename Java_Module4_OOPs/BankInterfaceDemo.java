interface Bank {
    double rateOfInterest();
}

class SBI implements Bank {
    public double rateOfInterest() {
        return 6.5;
    }
}

class HDFC implements Bank {
    public double rateOfInterest() {
        return 7.2;
    }
}

public class BankInterfaceDemo {
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("SBI ROI: " + b.rateOfInterest());

        b = new HDFC();
        System.out.println("HDFC ROI: " + b.rateOfInterest());
    }
}
