package service;


import java.sql.SQLException;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;

import model.Student;

public class StudentService {
	private StudentDao studentDaoImpl;
	

	public StudentDao getStudentDaoImpl() {
		return studentDaoImpl;
	}


	public void setStudentDaoImpl(StudentDao studentDaoImpl) {
		this.studentDaoImpl = studentDaoImpl;
	}



	public void saveStudent(Student student)  {  
		studentDaoImpl.save(student);
    }  
}
