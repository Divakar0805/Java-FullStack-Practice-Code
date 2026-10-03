package com;

import jakarta.persistence.*;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hotel h = em.find(Hotel.class, 1);
		
		if(h != null) {
			et.begin();
			em.remove(h);
			et.commit();
			System.out.println("Data Deleted");
		}else {
			System.out.println("Id not Found");
		}

	}

}
