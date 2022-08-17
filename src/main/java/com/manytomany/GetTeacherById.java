package com.manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetTeacherById {
	
	public static void main(String[] args) 
	{

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Teacher teacher = entityManager.find(Teacher.class, 1);
		
		System.out.println(teacher);
}
}