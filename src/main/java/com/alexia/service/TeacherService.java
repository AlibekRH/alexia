package com.alexia.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.alexia.repository.TeacherRepository;
import com.alexia.model.Teacher;

@Service
@Transactional
public class TeacherService {

	private final TeacherRepository teacherRepository;
	

	public TeacherService(TeacherRepository teacherRepository) {
		this.teacherRepository = teacherRepository;
	}
	
	public List<Teacher> findAll(){
		List<Teacher> teachers = new ArrayList<>();
		teachers = teacherRepository.findAll();
		return teachers;
	}
	
	public Teacher findTask(int id){
		return teacherRepository.findOne(id);
	}
	
	public void save(Teacher teacher){
		teacherRepository.save(teacher);
	}
	
	public void delete(int id){
		teacherRepository.delete(id);

	}
}

