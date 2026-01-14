package StudentManagemtproject;

import java.util.ArrayList;

public class StudentService {
	
	ArrayList<Student> students = new ArrayList<>();
	
	// Add student
	public void addStudent(Student s) {
		students.add(s);
		System.out.println("Student added successfully!");
	}
	
	
	//View all students
	
	public void viewStudents() {
		if(students.isEmpty()) {
			System.out.println("No students found.");
			return;
		}
		
		for(Student s : students) {
			System.out.println(s.getId() + " " + s.getName() + " " + s.getAge() + " " + s.getCourse());
		}
	}
	
	// Search student by id
	public Student searchStudent(int id) {
		for(Student s : students) {
			if(s.getId()== id) {
				return s;
			}
		}
		return null;
	}
	
	//Delete student
	public void deleteStudent(int id) {
		Student s = searchStudent(id);
		if(s != null) {
			students.remove(s);
			System.out.println("Student deleted.");
		} else {
			System.out.println("Student not found.");
		}
	}

}
