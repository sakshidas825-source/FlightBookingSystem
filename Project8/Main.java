package Project8;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BookingSystem bookingSystem =
                new BookingSystem();

        int choice;

        do {

            System.out.println("\n================================");
            System.out.println("     FLIGHT BOOKING SYSTEM");
            System.out.println("================================");
            System.out.println("1. View Flights");
            System.out.println("2. Book Flight");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    bookingSystem.displayFlights();
                    break;

                case 2:

                    bookingSystem.displayFlights();

                    System.out.print(
                            "\nEnter Flight ID: ");

                    int flightId =
                            scanner.nextInt();

                    bookingSystem.bookFlight(
                            flightId);
                    break;

                case 3:
                    System.out.println(
                            "Thank you for using the Flight Booking System.");
                    break;

                default:
                    System.out.println(
                            "Invalid Choice!");
            }

        } while (choice != 3);

        scanner.close();
    }
}