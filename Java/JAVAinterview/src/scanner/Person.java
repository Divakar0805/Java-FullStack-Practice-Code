package scanner;

public abstract  class Person {

	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	abstract boolean isOutStanding();
}

class Student extends Person{
	double percentage;

	public Student(String name,double percentage) {
		super(name);
		percentage=percentage;
	}
	
	@Override
	public boolean isOutStanding() {
		return percentage>85;
	}
	
	public void display() {
		System.out.println("Name:"+name+"-Percentage:"+percentage);
	}
}
class Professor extends Person{
	int books_published;

	public Professor(String name,int books_published) {
		super(name);
		// TODO Auto-generated constructor stub
		this.books_published=books_published;
	}
	
	@Override
	public boolean isOutStanding() {
		return books_published>4;
	}
	
	public void details() {
		System.out.println("Prof.Name:"+name+"-Books Published:"+books_published);
	}
}
