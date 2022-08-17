package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveTeachers

{

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Teacher teacher = new Teacher();

		teacher.setAge(34);
		teacher.setName("RamKrishna");
		
		Teacher teacher1 = new Teacher();

		teacher1.setAge(35);
		teacher1.setName("Parimala");
		
		

		Subjects subject1 = new Subjects();

		subject1.setSname("Maths");
		subject1.setSdays(35);

		Subjects subject2 = new Subjects();

		subject2.setSname("CS");
		subject2.setSdays(46);

		Subjects subject3 = new Subjects();

		subject3.setSname("EC");
		subject3.setSdays(38);

		List<Teacher> teachers = new ArrayList<Teacher>();

		teachers.add(teacher);
		subject1.setTeacher(teachers);
		subject2.setTeacher(teachers);
		subject3.setTeacher(teachers);

		entityTransaction.begin();

		entityManager.persist(teacher);
		entityManager.persist(subject1);
		entityManager.persist(subject2);
		entityManager.persist(subject3);

		entityTransaction.commit();

		System.out.println("------------Data Stored--------------");

	}
}
