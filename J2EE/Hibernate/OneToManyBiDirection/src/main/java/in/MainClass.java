package in;

import java.util.ArrayList;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Batch b = new Batch();
		b.setBcode("M29");
		b.setSubject("ADV JAVA");
		b.setTrainer("suriya");
		b.setNoOfStd(150);
		b.setTiming("2:00 pm");
		
		
		Student s = new Student();
		s.setName("priya");
		s.setEmail("priyuu@gmail.com");
		s.setGender("female");
		s.setPhone(915094837);
		s.setBatch(b);
		
		Student s2 = new Student();
		s2.setName("anu");
		s2.setEmail("anuu@gmail.com");
		s2.setGender("female");
		s2.setPhone(890765321);
		s2.setBatch(b);
		
		Student s3 = new Student();
		s3.setName("abi");
		s3.setEmail("tom@gmail.com");
		s3.setGender("male");
		s3.setPhone(789645212);
		s3.setBatch(b);
		List<Student> a1 = new ArrayList<Student>();
		a1.add(s);
		a1.add(s2);
		a1.add(s3);
		
		b.setStudents(a1);
		et.begin();
		em.persist(b);
		et.commit();
		System.out.println("Data saved");
		
		
		
		
		

	}

}