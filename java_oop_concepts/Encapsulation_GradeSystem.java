// Demonstrates encapsulation with internal logic (grade calculation)

class ReportCard {
    private int marks; // hidden variable

    // Setter with validation
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Enter between 0 and 100.");
        }
    }

    // Getter that provides processed data
    public String getGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "Fail";
    }
}

public class Encapsulation_GradeSystem {
    public static void main(String[] args) {
        ReportCard r = new ReportCard();
        r.setMarks(88);
        System.out.println("Grade: " + r.getGrade());
    }
}
