public class TestCourse {
	public static void main(String[] args) {
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		
		System.out.println("Number of students in course1: " +
		course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for(int i = 0; i < course1.getNumberOfStudents(); i++) System.out.print(students[i] + ", ");
		System.out.println();
		
		course1.dropStudent("Kim Smith");
		System.out.println("Number of students in course1: " +
		course1.getNumberOfStudents());
		students = course1.getStudents();
		for(int i = 0; i < course1.getNumberOfStudents(); i++) System.out.print(students[i] + ", ");
		System.out.println();
		
		System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
		students = course2.getStudents();
		for(int i = 0; i < course2.getNumberOfStudents(); i++) System.out.print(students[i] + ", ");
		System.out.println();
		
		course2.clear();
		System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
		students = course2.getStudents();
		for(int i = 0; i < course2.getNumberOfStudents(); i++) System.out.print(students[i] + ", ");
		students = course2.getStudents();
		for(int i = 0; i < course2.getNumberOfStudents(); i++) System.out.print(students[i] + ", ");
		System.out.println();
	}
}
class Course{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents = 0;
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		int len = students.length;
		if (numberOfStudents > len) {
			students = new String[len * 2];
		}
		String[] s = new String[++numberOfStudents];
		for (int i = 0; i < s.length - 1; ++i) {s[i] = students[i]; };
		s[s.length - 1] = student;
		students = s;
	}
	public String[] getStudents() {
		String[] s = new String[students.length];
		for (int i = 0; i < students.length; ++i) s[i] = students[i];
		return s;
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
		for (; i < students.length; i++) {
			if (students[i].equals(student)) {
				n = i;
				break;
			}
			s[i] = students[i];
		}
		if (i == students.length) {
			System.out.println("no such student " + student);
			return;
		}
		for (i = n; i < s.length; i++) s[i] = students[i + 1];
		students = new String[s.length];
		for (i = 0; i < s.length; i++) students[i] = s[i];
	}
	public void clear() {
		for (String s: students) s = "";
		numberOfStudents = 0;
	}
}