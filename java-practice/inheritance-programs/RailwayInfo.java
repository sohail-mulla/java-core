public class RailwayInfo{

    public static void main(String[] args) {

        Passenger p = new Passenger();
        Ticket t = new Ticket();
        Train tr = new Train();

        // Passenger
        p.displaySystem();
        p.bookTicket();

        // Ticket
        t.displaySystem();
        t.showTicket();

        // Train
        tr.displaySystem();
        tr.showTrain();
    }
}

class RailwaySystem {

    String systemName = "Indian Railways";

    void displaySystem() {
        System.out.println("Railway System: " + systemName);
    }

    void generalInfo() {
        System.out.println("Provides transport services across the country");
    }
}


class Passenger extends RailwaySystem {

    String passengerName = "Rahul";

    void bookTicket() {
        System.out.println(passengerName + " booked a ticket");
    }
}


class Ticket extends RailwaySystem {

    int ticketNumber = 12345;

    void showTicket() {
        System.out.println("Ticket Number: " + ticketNumber);
    }
}


class Train extends RailwaySystem {

    String trainName = "Express";

    void showTrain() {
        System.out.println("Train Name: " + trainName);
    }
}