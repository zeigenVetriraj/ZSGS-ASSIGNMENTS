import travel.user.User;
 
/*
4. Design a travel booking system using two packages:`travel.booking – includes a class`Ticket with ticket ID, destination, and fare.`travel.user – includes a class`User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.
*/

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Sindubad", "U1001");
        u1.bookTicket("T123", "Kodaikanal", 1500.00);
    }
}
