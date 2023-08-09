package TechZenureBasics;
import java.util.Scanner;
public class Generatebill {

	

	

	public static void main(String[] args) {
		int PizzaUnitPrice=100;
		int PuffUnitPrice=20;
		int CoolDrinkUnitPrice=10;
		System.out.print("WELCOME TO GORANTLA THEATER");
		Scanner sc= new Scanner(System.in);

		     System.out.print("Enter the no. of pizza bought:  ");
		         int PizzaQty=sc.nextInt();
		    
		    System.out.print("Enter the Puffs bought: ");
		        int PufffQty=sc.nextInt();  
		    
		    System.out.println("Enter the Cool drinks bought: ");
		            int CoolDrinkQty=sc.nextInt();
		    System.out.println();
            int pizzacost = PizzaUnitPrice * PizzaQty;
            int puffcost = PuffUnitPrice * PufffQty;
            int cooldrinkcost = CoolDrinkUnitPrice * CoolDrinkQty;
            float totalcost = pizzacost + puffcost + cooldrinkcost;
            System.out.println();
		    
		    
		    System.out.println("Bill Details");
		
		        
		        System.out.printf("No of pizzas      :%d \t cost: %d \n", PizzaQty, pizzacost);
		        
		        System.out.printf("No of puffs       :%d \t cost: %d \n", PufffQty, puffcost);
		    
		        System.out.printf("No of Cool Drinks :%d \t cost: %d \n", CoolDrinkQty, cooldrinkcost);
		        System.out.println();
		        
		        System.out.printf("Total Price:%.2f\n", totalcost);
		        
		        System.out.println("ENJOY THE SHOW!!!");
	}

}
