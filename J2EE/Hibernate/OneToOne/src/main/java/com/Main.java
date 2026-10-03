package com;

import jakarta.persistence.*;

public class Main {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Engine e=new Engine();
		e.setEno("RDOJD8734568");
		e.setCc(250);
		e.setStroke(4);
		e.setType("Petrol");
		
		Bike b=new Bike();
		b.setNo("TN20QB7324"); 
		b.setColor("Orange");
		b.setBrand("KTM");
		b.setModel("RC250");
		b.setPrice(280000);
		b.setEngine(e);

		et.begin();
		em.persist(e);
		em.persist(b);
		et.commit();
		
		System.out.println("Data Saved");
		
		
	}

}
