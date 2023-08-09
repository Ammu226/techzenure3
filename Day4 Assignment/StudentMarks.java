package TechZenureBasics;
import java.util.Arrays;
import java.util.Scanner;
public class StudentMarks {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("\tREPORT CARD");
		System.out.println("enter student name: ");
		String studentName=sc.nextLine();
		System.out.println("enter number of subjects: ");
		int num=sc.nextInt();
		System.out.println();
		int[] marks=new int[num];
		for(int i=0;i<marks.length;i++) {
			System.out.println("enter mark for subject-"+(i+1)+":");
	        marks[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("marks entered: "+Arrays.toString(marks)+"\n");
		System.out.println("Student Name: "+studentName.toUpperCase()+"\n");
		System.out.println();
		System.out.println("SUBJECT\t\tMARK");
		for(int i=0;i<marks.length;i++) {
		System.out.println("subject-"+(i+1)+"\t"+marks[i]);
		}
		System.out.println();
		int totalmarks=0;
		for(int i=0;i<marks.length;i++) {
			totalmarks+=marks[i];
		}
		float average=totalmarks/marks.length;
		System.out.println("TOTAL: "+totalmarks+"\tAVERAGE:"+average);
		
		
			
		}
		
		
		
	
}

