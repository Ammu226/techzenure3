package TechZenureBasics;
import java.util.Scanner;
public class NumberToWord {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter the given number ");
		
		int n=scn.nextInt();
		
		
		int s=0;
		while(n>0) {          // reverse number
			
			
			int r=n%10;
			n=n/10;
			s=s*10+r;
			
			
		}
		
		n=s;
		while(n>0) {
			
				
				int r=n%10;
				n=n/10;
				
			
		if(r==0)
		{
			System.out.print(" zero ");
		}
		if(r==1)
		{
			System.out.print(" ONE ");
		}
		if(r==2)
		{
			System.out.print(" TWO ");
		}
		if(r==3)
		{
			System.out.print(" THREE ");
		}
		if(r==4)
		{
			System.out.print(" FOUR ");
		}
		if(r==5)
		{
			System.out.print(" FIVE ");
		}
		if(r==6)
		{
			System.out.print(" SIX ");
		}
		if(r==7)
		{
			System.out.print(" SEVEN ");
		}
		if(r==8)
		{
			System.out.print(" EIGHT ");
		}
		if(r==9)
		{
			System.out.print(" NINE ");
		}

	}
		System.out.println();

	}

}
