package in;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchBatch {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Batch b=em.find(Batch.class, "M29");
		System.out.println(b);
		System.out.println(b.getStudents());
		
	}

}
