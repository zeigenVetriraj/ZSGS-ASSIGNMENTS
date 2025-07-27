package travel.booking;

public class Ticket {
    private String ticketID;
    private String destination;
    private double fare;

    public Ticket(String ticketID, String destination, double fare) {
        this.ticketID = ticketID;
        this.destination = destination;
        this.fare = fare;
    }

    public String getTicketID() {
        return ticketID;
    }

    public String getDestination() {
        return destination;
    }

    public double getFare() {
        return fare;
    }

    public void showTicketDetails() {
        System.out.println("----- Ticket Details -----");
        System.out.println("Ticket ID    : " + ticketID);
        System.out.println("Destination  : " + destination);
        System.out.println("Fare         : ₹" + fare);
        System.out.println("---------------------------");
    }
}
