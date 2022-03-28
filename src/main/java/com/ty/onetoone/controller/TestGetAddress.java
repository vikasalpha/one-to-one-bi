package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Address;
import com.ty.onetoone.dto.Branch;

public class TestGetAddress {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Address address = entityManager.find(Address.class, 1);
		System.out.println("Area : "+address.getArea());
		System.out.println("Pin : "+address.getPin());
		System.out.println("State : "+address.getState());
		System.out.println("---------Branch-------");
		Branch branch = address.getBranch();
		System.out.println("Branch Name "+branch.getName());
		System.out.println("Branch phone "+branch.getPhone());
		
		
	}
}
