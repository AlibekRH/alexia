package com.alexia.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.alexia.model.It;
import com.alexia.model.User;
import org.springframework.stereotype.Service;

import com.alexia.repository.ItTaskRepository;
import com.alexia.model.ItTask;

@Service
@Transactional
public class UserItService {

	private final ItTaskRepository itTaskRepository;

	public UserItService(ItTaskRepository itTaskRepository) {
		this.itTaskRepository = itTaskRepository;
	}
	
	public List<ItTask> findAll(){
		List<ItTask> user_its = new ArrayList<>();
		user_its = itTaskRepository.findAll();
		return user_its;
	}
	
	public ItTask findUserIt(int id){
		return itTaskRepository.findOne(id);
	}
	
	public void save(ItTask user_it){
		itTaskRepository.save(user_it);
	}
	
	public void delete(int id){
		itTaskRepository.delete(id);

	}

	public List<ItTask> findByUser(User user) {
		return itTaskRepository.findByUser(user);
	}

	public Object findByIt(It findTask) {
		// TODO Auto-generated method stub
		return null;
	}
}
