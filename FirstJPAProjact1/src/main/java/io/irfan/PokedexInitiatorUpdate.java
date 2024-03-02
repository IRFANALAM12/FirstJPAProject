package io.irfan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexInitiatorUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("irfan");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Pokemon P =entityManager.find(Pokemon.class,"pikachu");
		if(P != null) {
			P.setPower(200);
			entityTransaction.begin();
			entityManager.persist(P);
			entityTransaction.commit();
		}
		else {
			System.out.println("Entry does not exist");
		}
	}

}
