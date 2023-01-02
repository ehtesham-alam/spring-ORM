package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Student;

public class DaoImpl    {
	
	

	private HibernateTemplate hibernateTemplate;
	
	// Setter getter for injecting object
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

@Transactional //activate by applying tx:annotation-driven in B.xml and tx annotation-driven get by apply .xsd file in B.xml
	public int insert(Student student) {
	
		System.out.println(student);
		System.out.println(hibernateTemplate);
		Integer i=(Integer)this.hibernateTemplate.save(student);

		return i;
	}

// fetching single record
public Student get(int a)
{
	Student student = hibernateTemplate.get(Student.class, a);
	return student;
}

//fetching all  record
@Transactional 
public List< Student> getAll()
{
	List<Student> list =hibernateTemplate.loadAll(Student.class);
	
	return list;
}

//update   record
@Transactional 
public void update(Student student)
{
	 hibernateTemplate.update(student);;
	
}

@Transactional
public void delete(Student student)
{
	hibernateTemplate.delete(student);
}

}
