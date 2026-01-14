package StudentManagemtproject;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		
		while(true) {
			System.out.println("\n1.Add Student");
			System.out.println("2. View  Student");
			System.out.println("3. Search Student");
			System.out.println("4.Delete Student");
			System.out.println("5 Exit");
			
			
			System.out.println("Choose option: ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("Enter Id: ");
				int id = sc.nextInt();
				
				System.out.print("Enter Nmae: ");
				String name = sc.next();
				
				System.out.print("Enter Age: ");
				int age = sc.nextInt();
				
				System.out.print("Enter Course: ");
				String course = sc.next();
				
				Student s = new Student(id,name,age,course);
				service.addStudent(s);
				break;
				
			case 2:
				service.viewStudents();
				break;
				
			case 3:
				System.out.print("Enter Id to search:" );
				int sid = sc.nextInt();
				Student found = service.searchStudent(sid);
				if(found != null) {
					System.out.println(found.getName() + " " + found.getCourse());
				} else {
					System.out.println("Student not found");
				}
				break;
			case 4:
				System.out.print("Enter ID to delete: ");
				int did = sc.nextInt();
				service.deleteStudent(did);
				break;
				
			case 5:
				System.out.println("Thank You!");
				System.exit(0);
				
				default:
					System.out.println("Invalid choice");
				
			}
		}

	}

}
