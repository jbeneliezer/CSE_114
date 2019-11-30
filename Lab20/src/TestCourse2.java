import java.util.ArrayList;
public class TestCourse2 {
	public static void main(String[] args) {
		C course1 = new C("Data Structures");
		C course2 = new C("Database Systems");
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		
		System.out.println("Number of students in course1: " +
		course1.getNumberOfStudents());
		ArrayList<String> students = course1.getStudents();
		for(int i = 0; i < course1.getNumberOfStudents(); i++) System.out.print(students.get(i) + ", ");
		System.out.println();
		
		course1.dropStudent("Kim Smith");
		System.out.println("Number of students in course1: " +
		course1.getNumberOfStudents());
		students = course1.getStudents();
		for(int i = 0; i < course1.getNumberOfStudents(); i++) System.out.print(students.get(i) + ", ");
		System.out.println();
		
		System.out.println("Number of students in course2: " +
				course2.getNumberOfStudents());
		students = course2.getStudents();
		for(int i = 0; i < course2.getNumberOfStudents(); i++) System.out.print(students.get(i) + ", ");
		System.out.println();
		
		course2.clear();
		System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
		students = course2.getStudents();
		for(int i = 0; i < course2.getNumberOfStudents(); i++) System.out.print(students.get(i) + ", ");
		students = course2.getStudents();
		for(int i = 0; i < course2.getNumberOfStudents(); i++) System.out.print(students.get(i) + ", ");
		System.out.println();
	}
}

class C {
	private String courseName;
	private ArrayList<String> students = new ArrayList<String>(100);
	private int numberOfStudents;
	public C(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		students.add(student);
		numberOfStudents++;
	}
	public ArrayList<String> getStudents() {
		return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudent(String student) {
		--numberOfStudents;
		String[] s = new String[numberOfStudents];
		int n = 0;
		int i = 0;
		for (; i < students.size(); i++) {
			if (students.get(i).equals(student)) {
				students.remove(i);
				break;
			}
		}
		if (i == students.size()) {
			System.out.println("no such student " + student);
			return;
		}
	}
	public void clear() {
		for (String s: students) s = "";
		numberOfStudents = 0;
	}
}