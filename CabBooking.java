import java.util.Scanner;

class CabBooking {
    String passengerName;
    String cabType;
    int distance;
    int fare;

    // Quick Booking
    CabBooking(String passengerName) {
        this.passengerName = passengerName;
        this.cabType = "Mini";
        this.distance = 5;
        this.fare = 75;
    }

    // Custom Booking
    CabBooking(String passengerName, String cabType, int distance) {
        this.passengerName = passengerName;
        this.cabType = cabType;
        this.distance = distance;
        this.fare = distance * 15;
    }

    void displayBooking() {
        System.out.println("Passenger: " + passengerName);
        System.out.println("Cab Type: " + cabType);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: Rs. " + fare);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        String passengerName = sc.next();

        CabBooking booking;

        if (choice == 1) {
            booking = new CabBooking(passengerName);
        } else {
            String cabType = sc.next();
            int distance = sc.nextInt();

            booking = new CabBooking(passengerName, cabType, distance);
        }

        booking.displayBooking();
    }
}