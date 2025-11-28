// Real-world class to maintain gym member details

class GymMember {
    String memberName;
    String membershipType;
    int durationMonths;

    void register(String name, String type, int months) {
        memberName = name;
        membershipType = type;
        durationMonths = months;
    }

    void showDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Duration: " + durationMonths + " months");
    }
}

public class RealWorld_GymMember {
    public static void main(String[] args) {
        GymMember m = new GymMember();
        m.register("Mohammed Talha", "Premium", 12);
        m.showDetails();
    }
}
