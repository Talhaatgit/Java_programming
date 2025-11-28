import java.util.Scanner;

class Doctor {
    double consultationFee() {
        return 0.0;
    }
}

class Dentist extends Doctor {
    @Override
    double consultationFee() {
        return 500.0;
    }
}

class Cardiologist extends Doctor {
    @Override
    double consultationFee() {
        return 1200.0;
    }
}

class Surgeon extends Doctor {
    @Override
    double consultationFee() {
        return 2000.0;
    }
}

public class DoctorFeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose doctor type:");
        System.out.println("1. Dentist");
        System.out.println("2. Cardiologist");
        System.out.println("3. Surgeon");
        System.out.print("Enter choice (1-3): ");
        int choice = sc.nextInt();

        Doctor d;
        switch (choice) {
            case 1: d = new Dentist(); break;
            case 2: d = new Cardiologist(); break;
            case 3: d = new Surgeon(); break;
            default:
                System.out.println("Invalid choice.");
                sc.close();
                return;
        }

        System.out.println("Consultation Fee: ₹" + d.consultationFee());
        sc.close();
    }
}

