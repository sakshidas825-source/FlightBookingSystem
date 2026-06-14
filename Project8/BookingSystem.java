package Project8;
import java.util.ArrayList;

public class BookingSystem {

    private ArrayList<Flight> flights;

    public BookingSystem() {

        flights = new ArrayList<>();

        flights.add(new Flight(101,
                "Delhi",
                "Mumbai",
                10,
                5500));

        flights.add(new Flight(102,
                "Delhi",
                "Bangalore",
                15,
                6200));

        flights.add(new Flight(103,
                "Mumbai",
                "Chennai",
                12,
                4800));

        flights.add(new Flight(104,
                "Kolkata",
                "Hyderabad",
                8,
                5300));
    }

    public void displayFlights() {

        System.out.println("\n===== Available Flights =====");

        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

    public void bookFlight(int flightId) {

        for (Flight flight : flights) {

            if (flight.getFlightId() == flightId) {

                if (flight.getAvailableSeats() > 0) {

                    flight.reserveSeat();

                    System.out.println("\nBooking Successful!");
                    System.out.println(
                            "Ticket Price: ₹"
                                    + flight.getTicketPrice());

                } else {

                    System.out.println(
                            "No seats available.");
                }

                return;
            }
        }

        System.out.println("Flight not found.");
    }
}