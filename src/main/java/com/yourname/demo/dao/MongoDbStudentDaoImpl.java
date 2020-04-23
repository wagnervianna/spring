package com.yourname.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.yourname.demo.model.Student;

@Repository("mongoDbDao" )
public class MongoDbStudentDaoImpl implements StudentDao{

	@Override
	public int insertNewStudent(UUID studentId, Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student selectStudentById(UUID studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> selectAllStudents() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(UUID.randomUUID(), 18, "Mongo", "DB", "NoSqlDB"));
		return students;
	}

	@Override
	public int updateStudentById(UUID studentId, Student studentUpdated) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudentById(UUID studentId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
