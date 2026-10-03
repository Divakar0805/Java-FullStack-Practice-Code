package com;

import jakarta.persistence.*;

public class FechDetailst {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Person p=em.find(Person.class, 1);
		System.out.println(p);
	}
}
