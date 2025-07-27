package travel.user;

import travel.booking.Ticket;

public class User {
    private String name;
    private String userID;

    public User(String name, String userID) {
        this.name = name;
        this.userID = userID;
    }

    public void bookTicket(String ticketID, String destination, double fare) {
        System.out.println("User Name : " + name);
        System.out.println("User ID   : " + userID);
        Ticket ticket = new Ticket(ticketID, destination, fare);
        ticket.showTicketDetails(); // Accessing Ticket data from User class
    }
}
