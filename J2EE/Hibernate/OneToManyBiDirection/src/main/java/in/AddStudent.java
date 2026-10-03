package in;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AddStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Batch b=em.find(Batch.class, "M29");
		
		Student s1=new Student();
		s1.setName("Dimple");
		s1.setGender("Male");
		s1.setEmail("Dimple@gmail.com");
		s1.setPhone(638091316);
		
		b.addStudent(s1);
		
		
		et.begin();
		em.merge(b);
		et.commit();
		System.out.println("Data Added");
	}

}
