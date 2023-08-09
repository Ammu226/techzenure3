package TechZenureBasics;
import java.util.Scanner;
public class EvenNumberRange {

	public static void main(String[] args) {
        System.out.println("Enter the Number");
		
		Scanner scn = new Scanner(System.in);
		int i = scn.nextInt();
		int n = scn.nextInt();
		
		
		
		for(;i<=n;i++){
			
			
			
		if(i%2==0){
			
			System.out.print(" "+i);
		}
		else {
			
			System.out.print(",");
		}
		
			
		}
		
		System.out.println();


	}

}
