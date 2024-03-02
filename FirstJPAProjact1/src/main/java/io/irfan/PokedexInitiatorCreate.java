package io.irfan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexInitiatorCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon  p1 = new Pokemon();
		p1.setName("Pikachu");
		p1.setPower(100);
		p1.setType("electrical");
		
		Pokemon  p2 = new Pokemon();
		p2.setName("chaaarizard");
		p2.setPower(200);
		p2.setType("Fire");
		
		Pokemon  p3 = new Pokemon();
		p3.setName("Meowth");
		p3.setPower(80);
		p3.setType("cat");
		
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("irfan");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		
		entityTransaction.commit();
	}

}
