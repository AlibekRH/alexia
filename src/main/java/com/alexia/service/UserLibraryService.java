package com.alexia.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.alexia.model.Department;
import com.alexia.model.Library;
import com.alexia.model.User;
import org.springframework.stereotype.Service;

import com.alexia.repository.LibraryTaskRepository;
import com.alexia.model.LibraryTask;

@Service
@Transactional
public class UserLibraryService {

	private final LibraryTaskRepository libraryTaskRepository;

	public UserLibraryService(LibraryTaskRepository libraryTaskRepository) {
		this.libraryTaskRepository = libraryTaskRepository;
	}
	
	public List<LibraryTask> findAll(){
		List<LibraryTask> user_librarys = new ArrayList<>();
		user_librarys = libraryTaskRepository.findAll();
		return user_librarys;
	}
	
	public LibraryTask findUserDepartment(int id){
		return libraryTaskRepository.findOne(id);
	}
	
	public void save(LibraryTask user_library){
		libraryTaskRepository.save(user_library);
	}
	
	public void delete(int id){
		libraryTaskRepository.delete(id);

	}
	public Object findByLibrary(Library findTask) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<LibraryTask> findByUser(User user) {
		return libraryTaskRepository.findByUser(user);
	}
}

