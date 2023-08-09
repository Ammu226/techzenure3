package TechZenureBasics;
import java.util.Scanner;

public class MovieTicketCalculation {

	private static int numOFTickects;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of tickets: ");
		int numOfTickects=sc.nextInt();
		double discount=0.1;
		double couponDiscount=0.02;
		int kingTicketCost=75;
		int queenTicketCost=150;
		int refreshmentCharge=50;
		double ticketCost;
		if(numOfTickects>=5 && numOfTickects <=40) {
			System.out.println("Do you want refreshment: ");
			char refreshment=sc.next().charAt(0);
			System.out.println("Do you have coupon code: ");
			char couponCode=sc.next().charAt(0);
			System.out.println("Enter the Circle: ");
			char circle=sc.next().charAt(0);
			
			if(circle=='k') {
			ticketCost=numOfTickects*kingTicketCost;
			}
			else {
				ticketCost=numOfTickects*queenTicketCost;
			}
			double discount1=0;
			if(numOFTickects>20)
				discount1=ticketCost*discount;
			    ticketCost=ticketCost-discount1;
			    double discount2=0;
			    if(couponCode=='Y')
			    	discount2=ticketCost*couponDiscount;
			    ticketCost=ticketCost-discount2;
			    if(refreshment=='Y')
			    	ticketCost+=(numOfTickects*refreshmentCharge);
			    System.out.println("Ticket cost: "+ticketCost);
		}
		else {
			System.out.println("minimum of 5 and maximum of 40 tickets");
			    
				
			
		}
		

	}

}
