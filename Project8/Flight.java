package Project8;
public class Flight {

    private int flightId;
    private String source;
    private String destination;
    private int availableSeats;
    private double ticketPrice;

    public Flight(int flightId,
                  String source,
                  String destination,
                  int availableSeats,
                  double ticketPrice) {

        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.availableSeats = availableSeats;
        this.ticketPrice = ticketPrice;
    }

    public int getFlightId() {
        return flightId;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void reserveSeat() {
        availableSeats--;
    }

    @Override
    public String toString() {
        return "Flight ID: " + flightId +
                " | " + source + " -> " + destination +
                " | Seats: " + availableSeats +
                " | Price: ₹" + ticketPrice;
    }
}