package io.irfan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokemonInitiatorDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("irfan");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Pokemon P =entityManager.find(Pokemon.class,"pikachu");
		entityTransaction.begin();
		entityManager.remove(P);
		entityTransaction.commit();
	}

}
