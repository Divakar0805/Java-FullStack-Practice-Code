package scanner;

public class TestPerson {

	public static void main(String[] args) {
		Person[] people=new Person[5];
		people[0]=new Student("Dinga", 90);
		people[1]=new Professor("Tabrez",5);
		people[2]=new Professor("Daya", 3);
		people[3]=new Student("Mangi",70);
		people[4]=new Student("Sangi",86);
		
		for (int i = 0; i < people.length; i++) {
			
			if(people[i] instanceof Professor) {
		
				Professor prof=(Professor)people[i];
				if(prof.isOutStanding())
					prof.details();
			}else if(people[i] instanceof Student) {
				Student s=(Student)people[i];
				if(s.isOutStanding())
					s.display();
			}
				
		}
		
		
		
	}
}
