package TechZenureBasics;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Student {
	

	
		protected static int studentId;
		protected String name;
		protected static int departmentId;
		protected static String gender;
		protected static String phone;
		
		public static int getStudentId() {
			return studentId;
		}
		@SuppressWarnings("static-access")
		public void setStudentId(int studentId) {
			this.studentId=studentId;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		public static int getDepartmentId() {
			return departmentId;
		}
		@SuppressWarnings("static-access")
		public void setDepartmentId(int departmentId) {
			this.departmentId=departmentId;
		}
		public static String getGender() {
			return gender;
		}
		@SuppressWarnings("static-access")
		public void setGender(String gender) {
			this.gender=gender;
		}
		public static String getPhone() {
			return phone;
		}
		@SuppressWarnings("static-access")
		public void setPhone(String phone) {
			this.phone=phone;
		}
}
class Hosteller extends Student {
	private static String hostelName;
	private static int roomNumber;
	
	@SuppressWarnings("static-access")
	public Hosteller(String hostelName, int roomNumber) {
		this.hostelName=hostelName;
		this.roomNumber=roomNumber;
	}
	
	public static String getHostelName() {
		return hostelName;
	}
	@SuppressWarnings("static-access")
	public void setHostelName(String hostelName) {
		this.hostelName=hostelName;
	}
	public static  int getRoomNumber() {
		return roomNumber;
	}
	@SuppressWarnings("static-access")
	public void setRoomNumber(int roomNumber) {
		this.roomNumber=roomNumber;
	}

	public static String getName() {
		return null;
	}

}


