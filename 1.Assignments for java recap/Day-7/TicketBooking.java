
/*
5. Develop a Java application for a Ticket Booking System that allows users to book tickets for different types of transportation modes such as Bus, Train, and Flight.
Define a common interface or abstract class`Ticket with a method`bookTicket() that each transportation mode must implement differently.
Create classes`BusTicket,`TrainTicket, and`FlightTicket that extend the abstract class or implement the interface.
Demonstrate runtime polymorphism by calling the`bookTicket() method using a reference of the base class/interface.
*/

public class TicketBooking {
    public static void main(String[] args) {
        // Using interface reference for runtime polymorphism
        Ticket ticket;

        ticket = new BusTicket("Chennai", "Bangalore");
        ticket.bookTicket();

        ticket = new TrainTicket("Delhi", "Mumbai");
        ticket.bookTicket();

        ticket = new FlightTicket("Hyderabad", "Dubai");
        ticket.bookTicket();
    }
}

interface Ticket {
    void bookTicket();
}

class BusTicket implements Ticket {
    String from, to;

    public BusTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public void bookTicket() {
        System.out.println("Bus Ticket Booked from " + from + " to " + to);
    }
}

class TrainTicket implements Ticket {
    String from, to;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public void bookTicket() {
        System.out.println("Train Ticket Booked from " + from + " to " + to);
    }
}

class FlightTicket implements Ticket {
    String from, to;

    public FlightTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public void bookTicket() {
        System.out.println("Flight Ticket Booked from " + from + " to " + to);
    }
}
