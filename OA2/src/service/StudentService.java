package service;

import java.sql.SQLException;

import dao.StudentDao;

import model.Student;

public class StudentService {
	private StudentDao studentDao;
	
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void saveUser(Student student) {  
		try {
			studentDao.saveUser(student);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }  
}
