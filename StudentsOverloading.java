package week3.Day1.Assignment;

public class StudentsOverloading {
	
	public void getStudentInfo(int id) {
		System.out.println("Students ID :" +id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID:" +id +   "Student Name :" +name);
	}
	public void getStudentInfo(String email, long Phonenumber ) {
		System.out.println("Student email :" +email + "Ph.Number :" +Phonenumber);
	}

	public static void main(String[] args) {

		StudentsOverloading stu=new StudentsOverloading();
		stu.getStudentInfo(12345);
		stu.getStudentInfo(12345,   "Kavya");
		stu.getStudentInfo("kavyasoftech@gmail.com", 8122793532l);
	}

}
