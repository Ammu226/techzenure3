package TechZenureBasics;

import java.util.Scanner;

public class ContactDetails {

	
	 
	public static void main(String[] args) {
		 System.out.println("\nThe Student Details are as follows:");
		 System.out.println("Student ID: "+Hosteller.getStudentId());
		 System.out.println("Student Name: "+Hosteller.getName());
		 System.out.println("Department ID: "+Hosteller.getDepartmentId());
		 System.out.println("Student Gender: "+Hosteller.getGender());
		 System.out.println("Student Phone No: "+Hosteller.getPhone());
		 System.out.println("Hostel Name: "+Hosteller.getHostelName());
		 System.out.println("Room No: "+Hosteller.getRoomNumber());
	}
	public static Hosteller getHostellerDetails(String hostelName) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Student Details & Hostel Details:");
		
		System.out.println("Student ID: ");
		int studentId=scanner.nextInt();
		scanner.nextLine();//consume the newline
		
		System.out.println("Student Name: ");
		String name=scanner.nextLine();
		
		System.out.println("Department ID");
        int departmentId=scanner.nextInt();
        scanner.nextLine();//consume the newline
        
        System.out.println("Gender[M/F]: ");
        String gender=scanner.nextLine();
        
        System.out.println("Phone Number: ");
        String phone=scanner.nextLine();
        
       System.out.println("Room Number: ");
       int roomNumber=scanner.nextInt();
       scanner.nextInt();//consume the newline
       
       Hosteller hosteler = new Hosteller(hostelName, roomNumber);
       hosteler.setStudentId(studentId);
       hosteler.setName(name);
       hosteler.setDepartmentId(departmentId);
       hosteler.setGender(gender);
       hosteler.setPhone(phone);
       System.out.println("Modify Room Number(y/n): ");
       String modifyRoom=scanner.nextLine();
       if(modifyRoom.equalsIgnoreCase("y")) {
    	   System.out.println("New Room Number: ");
    	   int newRoomNumber=scanner.nextInt();
    	   hosteler.setRoomNumber(newRoomNumber);
       }
       System.out.println("Modify Phone Number(Y/N): ");
       String modifyPhone=scanner.nextLine();
       if(modifyPhone.equalsIgnoreCase("Y")) {
    	   System.out.println("New Phone Number: ");
    	   String newPhone=scanner.nextLine();
    	   hosteler.setPhone(newPhone);
       }
       scanner.close();
       return hosteler;
       }
	      
		

	}


