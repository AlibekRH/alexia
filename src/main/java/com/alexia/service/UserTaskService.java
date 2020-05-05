package com.alexia.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.alexia.model.Task;
import com.alexia.model.User;
import org.springframework.stereotype.Service;

import com.alexia.repository.UserTaskRepository;
import com.alexia.model.UserTask;

@Service
@Transactional
public class UserTaskService {

	private final UserTaskRepository userTaskRepository;

	public UserTaskService(UserTaskRepository userTaskRepository) {
		this.userTaskRepository = userTaskRepository;
	}
	
	public List<UserTask> findAll(){
		List<UserTask> user_tasks = new ArrayList<>();
		user_tasks = userTaskRepository.findAll();
		return user_tasks;
	}
	
	public UserTask findUserTask(int id){
		return userTaskRepository.findOne(id);
	}
	
	public void save(UserTask user_task){
		userTaskRepository.save(user_task);
	}
	
	public void delete(int id){
		userTaskRepository.delete(id);

	}

	public List<UserTask> findByTask(Task task) {
		return userTaskRepository.findByTask(task);
	}
	public List<UserTask> findByUser(User user) {
		return userTaskRepository.findByUser(user);
	}
}

