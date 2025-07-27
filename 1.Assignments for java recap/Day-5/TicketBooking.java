
/*
4. Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common method but implement booking differently.
 */
public class TicketBooking {
    public static void main(String[] args) {
        
        Booking busTicket = new BusTicketBooking();
        Booking trainTicket = new TrainTicketBooking();
        Booking flightTicket = new FlightTicketBooking();

        
        System.out.println("----- Bus Ticket Booking -----");
        busTicket.bookTicket(3); // Booking 3 bus tickets
        ((BusTicketBooking) busTicket).display();

        System.out.println("\n----- Train Ticket Booking -----");
        trainTicket.bookTicket(2); // Booking 2 train tickets
        ((TrainTicketBooking) trainTicket).display();

        System.out.println("\n----- Flight Ticket Booking -----");
        flightTicket.bookTicket(1); // Booking 1 flight ticket
        ((FlightTicketBooking) flightTicket).display();
    }
}


class Booking {
    int bookingCharge = 10;

    // Common method to override
    public double bookTicket(int numberOfTickets) {
        return numberOfTickets * bookingCharge;
    }
}


class BusTicketBooking extends Booking {
    int ticketCharge = 500;
    int numberOfTickets;
    double totalCost;

    @Override
    public double bookTicket(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
        totalCost = super.bookTicket(numberOfTickets) + (numberOfTickets * ticketCharge);
        return totalCost;
    }

    public void display() {
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Total Cost: " + totalCost);
    }
}


class TrainTicketBooking extends Booking {
    int ticketCharge = 400;
    int numberOfTickets;
    double totalCost;

    @Override
    public double bookTicket(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
        totalCost = super.bookTicket(numberOfTickets) + (numberOfTickets * ticketCharge);
        return totalCost;
    }

    public void display() {
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Total Cost: " + totalCost);
    }
}


class FlightTicketBooking extends Booking {
    int ticketCharge = 5000;
    int numberOfTickets;
    double totalCost;

    @Override
    public double bookTicket(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
        totalCost = super.bookTicket(numberOfTickets) + (numberOfTickets * ticketCharge);
        return totalCost;
    }

    public void display() {
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Total Cost: " + totalCost);
    }
}
