package com;

import jakarta.persistence.*;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Hotel h = em.find(Hotel.class, 3);
		if(h != null) {
			System.out.println(h);
		}else {
			System.out.println("Id no Found");
		}
	}

}
