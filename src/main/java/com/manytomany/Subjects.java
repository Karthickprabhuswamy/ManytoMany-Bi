package com.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Subjects {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int sid;
	private String sname;
	private int sdays;
	
	@JoinTable(name="My_Teacher_Subject",joinColumns=@JoinColumn(name="Sub_id"),inverseJoinColumns =@JoinColumn(name="Teach_id"))
	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	@ManyToMany
	List<Teacher> teacher;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSdays() {
		return sdays;
	}

	public void setSdays(int sdays) {
		this.sdays = sdays;
	}

}
