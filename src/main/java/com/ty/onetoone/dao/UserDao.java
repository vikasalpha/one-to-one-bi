package com.ty.onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Address;
import com.ty.onetoone.dto.Branch;

public class UserDao {
	
	
	void get()  {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		//Creating branch object
		Branch branch = new Branch();
		branch.setName("QSP");
		branch.setPhone(9988);
		
		Address a = new Address();
		a.setArea("RAJ");
		a.setPin(9922);
		a.setState("KA");
		
		branch.setAddress(a);
		a.setBranch(branch);
		
		entityTransaction.begin();
		
		entityManager.persist(branch);
		entityManager.persist(a);
		
		entityTransaction.commit();
	}
	
	
}
