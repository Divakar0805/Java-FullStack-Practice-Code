package com;

import jakarta.persistence.*;

public class MainDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Person p = new Person();
		
		p.setName("Divakar");
		p.setGender("Male");
		p.setEmail("diva852002@gmail.com");
		p.setPh_no(6380913116L);

		Aadhar a = new Aadhar();
		a.setId(870149885707L);
		a.setAddress("Thiruvallur");
		a.setDob("08/05/2002");
		a.setFathername("Perumal");
		a.setPerson(p);
		p.setAadhar(a);

		et.begin();
		em.persist(p);
		em.persist(a);
		et.commit();

		System.out.println("Details Saved");

	}

}
