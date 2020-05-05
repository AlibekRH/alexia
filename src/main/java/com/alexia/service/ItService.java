package com.alexia.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.alexia.repository.ItRepository;
import com.alexia.model.It;

@Service
@Transactional
public class ItService {

	private final ItRepository itRepository;
	

	public ItService(ItRepository itRepository) {
		this.itRepository = itRepository;
	}
	
	public List<It> findAll(){
		List<It> its = new ArrayList<>();
		its = itRepository.findAll();
		return its;
	}
	
	public It findTask(int id){
		return itRepository.findOne(id);
	}
	
	public void save(It it){
		itRepository.save(it);
	}
	
	public void delete(int id){
		itRepository.delete(id);

	}
}
