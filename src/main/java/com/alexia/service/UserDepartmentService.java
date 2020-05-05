package com.alexia.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.alexia.model.Department;
import com.alexia.model.User;
import org.springframework.stereotype.Service;

import com.alexia.repository.DepartmentTaskRepository;
import com.alexia.model.DepartmentTask;

@Service
@Transactional
public class UserDepartmentService {

	private final DepartmentTaskRepository departmentTaskRepository;

	public UserDepartmentService(DepartmentTaskRepository departmentTaskRepository) {
		this.departmentTaskRepository = departmentTaskRepository;
	}
	
	public List<DepartmentTask> findAll(){
		List<DepartmentTask> user_departmens = new ArrayList<>();
		user_departmens = departmentTaskRepository.findAll();
		return user_departmens;
	}
	
	public DepartmentTask findUserDepartment(int id){
		return departmentTaskRepository.findOne(id);
	}
	
	public void save(DepartmentTask user_department){
		departmentTaskRepository.save(user_department);
	}
	
	public void delete(int id){
		departmentTaskRepository.delete(id);

	}

	public List<DepartmentTask> findByUser(User user) {
		return departmentTaskRepository.findByUser(user);
	}

	public Object findByDepartment(Department findTask) {
		// TODO Auto-generated method stub
		return null;
	}
}

