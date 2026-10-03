package com;

import jakarta.persistence.*;

public class DeleteBike {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Bike b=em.find(Bike.class, "TN20QB7324");
		Engine e=b.getEngine();
		
		et.begin();
		em.remove(e);
		em.remove(b);
		et.commit();
		
		System.out.println("Data Deleted");
	}
}
