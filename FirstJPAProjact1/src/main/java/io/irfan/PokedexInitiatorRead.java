package io.irfan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PokedexInitiatorRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("irfan");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Pokemon P =entityManager.find(Pokemon.class,"pikachu");
		System.out.println(P);
	}
}
