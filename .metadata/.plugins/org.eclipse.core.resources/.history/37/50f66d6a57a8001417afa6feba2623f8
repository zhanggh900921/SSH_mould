package dao;

import java.sql.SQLException;

import model.Student;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDao {
	 private HibernateTemplate hibernateTemplate;  
	  
	    public void setSessionFactory(SessionFactory sessionFactory) {  
	        this.hibernateTemplate = new HibernateTemplate(sessionFactory);  
	    }  
	  
	  
	    public void saveUser(Student student) throws SQLException {  
	        hibernateTemplate.save(student);  
	    }  
	  
	    
	    public void delUser(Student student) throws SQLException {  
	        hibernateTemplate.delete(student);  
	    }  
	  
	    
	    public void editUsre(Student student) throws SQLException {  
	        hibernateTemplate.update(student);  
	    }  
	  
	    
	    public Student getUserById(int id) throws SQLException {  
	    	Student student = (Student) hibernateTemplate.get(Student.class, id);  
	        return student;  
	    }  
}
