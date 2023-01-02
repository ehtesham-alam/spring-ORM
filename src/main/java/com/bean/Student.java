package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SpringORM")
public class Student {
	
	@Id
	private int student_id;
	private String student_name;
	private String student_add;
	public int getStudent_id() {
		return student_id;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_add=" + student_add
				+ "]";
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_add() {
		return student_add;
	}
	public void setStudent_add(String student_add) {
		this.student_add = student_add;
	}

}
