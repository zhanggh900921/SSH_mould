package dao.impl;

import java.sql.SQLException;

import model.Student;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.BaseDao;
import dao.StudentDao;

public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao{

}
