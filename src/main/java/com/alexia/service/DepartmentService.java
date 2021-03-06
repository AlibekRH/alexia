package com.alexia.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.alexia.repository.DepartmentRepository;
import com.alexia.model.Department;

@Service
@Transactional
public class DepartmentService {

	private final DepartmentRepository departmentRepository;
	

	public DepartmentService(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}
	
	public List<Department> findAll(){
		List<Department> departments = new ArrayList<>();
		departments = departmentRepository.findAll();
		return departments;
	}
	
	public Department findTask(int id){
		return departmentRepository.findOne(id);
	}
	
	public void save(Department department){
		departmentRepository.save(department);
	}
	
	public void delete(int id){
		departmentRepository.delete(id);

	}
}
