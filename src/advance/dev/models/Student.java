package advance.dev.models;

public class Student extends Person{
	float mark;
	public Student(String name, int old, float mark) {
		super(name, old);
		this.mark = mark;
	}
	
	public Student(String name, int old) {
		super(name, old);
		// TODO Auto-generated constructor stub
	}
}