package in;

import java.util.List;

import jakarta.persistence.*;
@Entity
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String bcode;
	private String subject;
	private String trainer;
	private String timing;
	private int noOfStd;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy="batch")
	private List<Student>students;
	
	public void addStudent(Student s) {
		students.add(s);
		s.setBatch(this);
		}
	public void removeStudent(Student s) {
		students.remove(s);
		s.setBatch(null);
	}

	public String getBcode() {
		return bcode;
	}

	public void setBcode(String bcode) {
		this.bcode = bcode;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public int getNoOfStd() {
		return noOfStd;
	}

	public void setNoOfStd(int noOfStd) {
		this.noOfStd = noOfStd;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Batch [bcode=" + bcode + ", subject=" + subject + ", trainer=" + trainer + ", timing=" + timing
				+ ", noOfStd=" + noOfStd + "]";
	}
	
	
	

}