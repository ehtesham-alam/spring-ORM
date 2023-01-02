package com.spring.hibernate.spring_Hibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.bean.Student;
import com.dao.DaoImpl;


 
public class App 
{
 
	public static void main( String[] args )
    
    {
		
    ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/hibernate/spring_Hibernate/B.xml");
    Student student = (Student) context.getBean("student");
    DaoImpl daoImpl= context.getBean(DaoImpl.class, "daoImpl");
    
    
    //for Saving single Object
    
	/*
	 * student.setStudent_id(4); student.setStudent_name("Farid4");
	 * student.setStudent_add("Sakinaka4"); daoImpl.insert(student);
	 */
    
    
    // for fetching Single User Object
    
   // Student student2 = daoImpl.get(4);
   // System.out.println(student2);
  
    
    // for fetching All User list
    
	/*
	 * List<Student> all = daoImpl.getAll(); for(Student s:all) {
	 * System.out.println(s); }
	 */
    
    
    // for update User
    
    
    // student.setStudent_id(4); student.setStudent_name("Farid44");
	 // student.setStudent_add("Sakinaka44");  
   // daoImpl.update(student);
    
    
    // for delete single User Object
    
    student.setStudent_id(3);
    daoImpl.delete(student);
    
    }
	
	
}
		