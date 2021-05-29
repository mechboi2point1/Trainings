package ani.school.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ani.school.service.SchoolService;

public class SchoolControl {
	
	
	static SchoolService service=new SchoolService();

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		while(true) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter Choice");
		System.out.println("Enter 1 to register new Entity Enter 2 to get All detail 3 to show all Members Of schoole");
		int choice=Integer.parseInt(br.readLine());
		//System.out.println(choice);
		if(choice==1) {
			//Register Student
			System.out.println("Enter Choice 1 for teacher and 2 for students");
			int entityChoice=Integer.parseInt(br.readLine());
			if(entityChoice==1) {
				System.out.println("Register new teacher");
				System.out.println("Enter name of new teacher");
				String name=br.readLine();
				System.out.println("Enter Experience");
				int experience=Integer.parseInt(br.readLine());
				System.out.println("Enter Salary");
				int salary=Integer.parseInt(br.readLine());
				String msg=service.registerTeacher(name, experience, salary);
				System.out.println(msg);
			}
			else if(entityChoice==2) {
			System.out.println("Register new student");
			System.out.println("Enter name of new student");
			String name=br.readLine();
			System.out.println("Enter rollNumber of new student");
			int rollNum=Integer.parseInt(br.readLine());
			System.out.println("Enter class of new student");
			String className=br.readLine();
			String msg=service.registerStudent(name, rollNum, className);
			System.out.println(msg);
			}
			else {
				System.out.println("Wrong choice");
			}
			
			
		}
		else if(choice==2) {
			//Show all student
			System.out.println("Enter Choice 1 for ShowAllteacher and 2 for ShowAllstudents");
			int entityChoice=Integer.parseInt(br.readLine());
			if(entityChoice==1) {
				System.out.println("Show all teacher");
				service.showAllTecher();
			}
			else if(entityChoice==2) {
				System.out.println("Show all student");
				service.showAllStudent();
			}
			else {
				System.out.println("Wrong choice");
			}
			
		}
		else if(choice==3) {
			//Show all student
			System.out.println("Showing all members");
			service.showAllStudent();
			service.showAllTecher();
			
		}
		else {
			System.out.println("Wrong choice");
		}
		}
		
		
		

	}

}
