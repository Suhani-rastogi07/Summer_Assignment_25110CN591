import java.util.*;

public class Q111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTickets = 20;
        int bookedTickets = 0;
        int choice, tickets;

        do {
            System.out.println("\n===== TICKET BOOKING SYSTEM =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Check Available Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of tickets to book: ");
                    tickets = sc.nextInt();

                    if (tickets <= (totalTickets - bookedTickets)) {
                        bookedTickets += tickets;
                        System.out.println("Ticket booked successfully.");
                    } else {
                        System.out.println("Not enough tickets available.");
                    }
                    break;

                case 2:
                    System.out.print("Enter number of tickets to cancel: ");
                    tickets = sc.nextInt();

                    if (tickets <= bookedTickets) {
                        bookedTickets -= tickets;
                        System.out.println("Ticket cancelled successfully.");
                    } else {
                        System.out.println("Invalid number of tickets.");
                    }
                    break;

                case 3:
                    System.out.println("Available Tickets: " + (totalTickets - bookedTickets));
                    System.out.println("Booked Tickets: " + bookedTickets);
                    break;

                case 4:
                    System.out.println("Thank you for using the Ticket Booking System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }
}