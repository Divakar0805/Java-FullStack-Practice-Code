package in;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s=em.find(Student.class, 3);
		Batch b=em.find(Batch.class, "M29");
		
		b.removeStudent(s);
		
		
		et.begin();
		em.merge(b);
		em.remove(s);
		et.commit();
		System.out.println("Data Deleted");
	}


}
