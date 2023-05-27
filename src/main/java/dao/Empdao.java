package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Empdto;

public class Empdao {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();

public String insert(Empdto d1) {
	et.begin();
	em.persist(d1);
	et.commit();
	return "Data is inserted";
	
}

public Empdto login(String email) {
Empdto dto=em.find(Empdto.class, email);
	return dto;
}

} 
