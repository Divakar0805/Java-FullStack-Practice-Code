package com;

import jakarta.persistence.*;


public class Association {
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hotel h = new Hotel();
		h.setFid(5);
		h.setFtype("veg");
		h.setFname("curdrice");
		h.setFvarient("normal");
		h.setFprice(50.00);
		
		
		et.begin();
		em.persist(h);
		et.commit();
		
		System.out.println("Data Saved");
		
	}
}
