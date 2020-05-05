package com.alexia.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.alexia.repository.LibraryRepository;
import com.alexia.model.Library;

@Service
@Transactional
public class LibraryService {

	private final LibraryRepository libraryRepository;
	

	public LibraryService(LibraryRepository libraryRepository) {
		this.libraryRepository = libraryRepository;
	}
	
	public List<Library> findAll(){
		List<Library> librarys = new ArrayList<>();
		librarys = libraryRepository.findAll();
		return librarys;
	}
	
	public Library findTask(int id){
		return libraryRepository.findOne(id);
	}
	
	public void save(Library library){
		libraryRepository.save(library);
	}
	
	public void delete(int id){
		libraryRepository.delete(id);

	}
}

