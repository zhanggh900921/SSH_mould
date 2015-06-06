package action;

import model.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import service.StudentService;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport{
	
	private String name;
	private Student student;
	private StudentService studentService; 

	
	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public StudentService getStudentService() {
		return studentService;
	}



	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	
	public String save() throws Exception {
		 	
			student.setName(name);
		    studentService.saveStudent(student);
		    return SUCCESS;
	} 
	
	
}
