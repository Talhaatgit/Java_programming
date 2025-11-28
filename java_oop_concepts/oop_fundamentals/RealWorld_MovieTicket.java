// Real-world movie ticket booking simulation

class MovieTicket {
    String movieName;
    String showTime;
    int seatNumber;

    void bookTicket(String movie, String time, int seat) {
        movieName = movie;
        showTime = time;
        seatNumber = seat;
    }

    void printTicket() {
        System.out.println("🎬 Movie: " + movieName);
        System.out.println("🕒 Show Time: " + showTime);
        System.out.println("💺 Seat No: " + seatNumber);
    }
}

public class RealWorld_MovieTicket {
    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket();
        t1.bookTicket("Avatar 3", "7:30 PM", 12);
        t1.printTicket();
    }
}
