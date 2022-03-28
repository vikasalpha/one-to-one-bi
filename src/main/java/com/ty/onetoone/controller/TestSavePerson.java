package com.ty.onetoone.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Pan;
import com.ty.onetoone.dto.Person;
/*
 * This calss is a n example for saving the person data to db
 */
public class TestSavePerson {
	public static void main(String[] args) {
	
		save();
	}
	
	
	static void save() {
		System.out.println("hi logic to save person");
		Person p = new Person();
		p.setName("Dimple");
	}
}
