package com.alexia.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.alexia.model.Teacher;
import com.alexia.model.User;
import org.springframework.stereotype.Service;

import com.alexia.repository.TeacherTaskRepository;
import com.alexia.model.TeacherTask;

@Service
@Transactional
public class TeacherTaskService {

	private final TeacherTaskRepository teacherTaskRepository;

	public TeacherTaskService(TeacherTaskRepository teacherTaskRepository) {
		this.teacherTaskRepository = teacherTaskRepository;
	}
	
	public List<TeacherTask> findAll(){
		List<TeacherTask> user_teachers = new ArrayList<>();
		user_teachers = teacherTaskRepository.findAll();
		return user_teachers;
	}
	
	public TeacherTask findUserTask(int id){
		return teacherTaskRepository.findOne(id);
	}
	
	public void save(TeacherTask user_teacher){
		teacherTaskRepository.save(user_teacher);
	}
	
	public void delete(int id){
		teacherTaskRepository.delete(id);

	}

	public List<TeacherTask> findByUser(User user) {
		return teacherTaskRepository.findByUser(user);
	}

	public Object findByTeacher(Teacher findTask) {
		// TODO Auto-generated method stub
		return null;
	}
}

