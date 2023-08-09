package TechZenureBasics;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int sum = 0;
		while (n>0){
			
			int r = n%10;
			sum = (sum*10)+r;
			n = n/10;
			
			
		}
		
		
	System.out.println(sum);


	}

}
