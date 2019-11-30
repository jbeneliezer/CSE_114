
class Person {
	protected String name;
	private String address;
	private String number;
	private String email;
	public Person(String n) { name = n; }
	public Person(String n, String a, String num, String e) {
		name = n;
		address = a;
		number = num;
		email = e;
	}
	public String toString() { return this.getClass() + " " + this.name; }
}

class Student extends Person {
	private final String status;
	public Student(String n, String s) {super(n); status = s;}
	public Student(String n, String a, String num, String e, String s) {
		super(n, a, num, e);
		status = s;
	}
	public String toString() { return this.getClass() + " " + this.name; }

}

class Employee extends Person {
	private String office;
	private int salary, experience;
	public Employee(String n) {super(n);}
	public Employee(String n, String a, String num, String e, String o, int sal, int ex) {
		super(n, a, num, e);
		office = o;
		salary = sal;
		experience = ex;
	}
	public String toString() { return this.getClass() + " " + this.name; }

}

class Faculty extends Employee {
	private String officeHours, rank;
	public Faculty(String n) {super(n);}
	public Faculty(String n, String a, String num, String e, String o, int sal, int ex, String off, String ra) {
		super(n, a, num, e, o, sal, ex);
		officeHours = off;
		rank = ra;
	}
	public String toString() { return this.getClass() + " " + this.name; }

}
class Staff extends Employee {
	private String title;
	public Staff(String n) {super(n);}
	public Staff(String n, String a, String num, String e, String o, int sal, int ex, String t) {
		super(n, a, num, e, o, sal, ex);
		title = t;
	}
	public String toString() { return this.getClass() + " " + this.name; }
}
public class TestPerson {

	public static void main(String[] args) {
		Person person = new Person("Jeff");
		Student student = new Student("Brian", "freshman");
		Employee employee = new Employee("Dan");
		Faculty faculty = new Faculty("David");
		Staff staff = new Staff("Jason");
		
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());

		
	}

}
