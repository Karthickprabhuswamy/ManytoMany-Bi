package com.manytomany;


	
	import java.util.List;

	import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToMany;

	@Entity
	public class Teacher {

		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Id
		private int id;
		private String name;
		private int age;

		@ManyToMany(mappedBy="teacher",fetch = FetchType.EAGER)
		private List<Subjects> subject;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public List<Subjects> getSubject() {
			return subject;
		}

		public void setSubject(List<Subjects> subject) {
			this.subject = subject;
		}

		
}
