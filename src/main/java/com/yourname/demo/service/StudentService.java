package com.yourname.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yourname.demo.dao.StudentDao;
import com.yourname.demo.model.Student;

@Service
public class StudentService {
	
	private final StudentDao studentDao;
	
	@Autowired
	public StudentService (@Qualifier("mongoDbDao") StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public int persisteNewStudent(UUID studentId, Student student) {
		UUID studentUId = studentId == null ? UUID.randomUUID() : studentId;
		student.setId(studentUId);
		return studentDao.insertNewStudent(studentUId, student);
	}

	public Student getStudentById(UUID studentId) {
		return studentDao.selectStudentById(studentId);
	}

	public List<Student> getAllStudents() {
		return studentDao.selectAllStudents();
	}

	public int updateStudentById(UUID studentId, Student studentUpdated) {
		return studentDao.updateStudentById(studentId, studentUpdated);
	}

	public int deleteStudentById(UUID studentId) {
		return studentDao.deleteStudentById(studentId);
	}
}
