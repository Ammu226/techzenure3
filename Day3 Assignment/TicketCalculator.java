package TechZenureBasics;
import java.util.Scanner;

public class TicketCalculator {

	

	public static void main(String[] args[]) {
		Scanner sc=new Scanner(System.in);

        System.out.print("Enter no of bookings: ");
        int numOfBookings=sc.nextInt();

        for (int i = 1; i <= numOfBookings; i++) {
            System.out.print("Booking " + i + " - Enter the available tickets: ");
            int availableTickets=sc.nextInt();

            System.out.print("Enter the ticket id: ");
            @SuppressWarnings("unused")
			int ticketId=sc.nextInt();

            System.out.print("Enter the price: ");
            double ticketPrice=sc.nextDouble();

            System.out.print("Enter the no of tickets: ");
            int numOfTickets = sc.nextInt();

            double totalCost = 0.0;

            if (numOfTickets <= availableTickets) {
                totalCost = ticketPrice * numOfTickets;
                System.out.println("Booking " + i + " - Total cost of the ticket: $" + totalCost);
                availableTickets -= numOfTickets;
            } else {
                System.out.println("Booking " + i + " - Not enough tickets available for this booking.");
            }
        }

        System.out.println("Thank you for using the Ticket Calculator!");
    }




}









