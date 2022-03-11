package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name : Kavya");
	}
	public void studentDept() {
		System.out.println("Student Department : Information Technology");
	}
	public void studentId() {
		System.out.println("Student ID : 123456789");
	}
	public static void main(String[] args) {
		Student stud=new Student();
		stud.studentDept();
		stud.studentId();
		stud.studentName();
		
		Department dept=new Department();
		dept.deptName();
		
		College col=new College();
		col.collegeCode();
		col.collegeName();
		col.collegeRank();
	}
	
}
