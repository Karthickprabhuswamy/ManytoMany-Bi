package com.manytomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetSubjectsById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Subjects subjects = entityManager.find(Subjects.class, 1);

		System.out.println("Sub id:" + subjects.getSid());
		System.out.println("Sub name:" + subjects.getSname());
		System.out.println("Sub Days" + subjects.getSdays());

		List<Teacher> teacher = subjects.getTeacher();

		for (Teacher teacher2 : teacher) {
			System.out.println("Teacher age:" + teacher2.getId());
			System.out.println("Teacher Name:" + teacher2.getName());
			System.out.println("Teacher age:" + teacher2.getAge());
			System.out.println("Teacher age:" + teacher2.getSubject());

		}

	}

}
