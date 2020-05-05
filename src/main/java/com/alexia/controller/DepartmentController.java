package com.alexia.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import com.alexia.model.User;
import com.alexia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.alexia.service.DepartmentService;
import com.alexia.service.UserDepartmentService;
import com.alexia.model.Department;

@Controller
@RequestMapping("/admin/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private UserDepartmentService userDepartmentService;

	@Autowired	
	private UserService userService;

	@RequestMapping(value="/new", method = RequestMethod.GET)
	public ModelAndView newTask(Model model){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("department", new Department());
		modelAndView.addObject("departments", departmentService.findAll());
		modelAndView.addObject("auth", getUser());
		modelAndView.addObject("control", getUser().getRole().getRole());
		modelAndView.addObject("mode", "MODE_NEW");
		modelAndView.setViewName("department");
		
	//	List<String> countryList = Arrays.asList("US","China");
	//	model.addAttribute("countryList", countryList);
	//	List<Country> countryObject = Arrays.asList(
		//		new Country("US","United"),
	//			new Country("CH","China")	
		//		);
		//model.addAttribute("countryObject", countryObject);
		List<String> countryObject = Arrays.asList("Алматы","Нур-Султан","Талдыкорган","Кызылорда","Шымкент","Тараз");
		model.addAttribute("countryObject",countryObject);
		List<String> nationalObject = Arrays.asList("Казах","Русский","Украинц","Узбек","Татар","Уйгыр");
		model.addAttribute("nationalObject",nationalObject);
		List<String> genderObject = Arrays.asList("Женский","Мужской");
		model.addAttribute("genderObject",genderObject);
		List<String> familyObject = Arrays.asList("Замужем","Женат","Не замужем","Не женат");
		model.addAttribute("familyObject",familyObject);
		return modelAndView;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveTask(@Valid Department department, BindingResult bindingResult) {
		department.setDateCreated(new Date());
		departmentService.save(department);
		ModelAndView modelAndView = new ModelAndView("redirect:/admin/departments/all");
		modelAndView.addObject("auth", getUser());
		modelAndView.addObject("control", getUser().getRole().getRole());
		return modelAndView;
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ModelAndView allTasks() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("rule", new Department());
		//POINT=7 http://stackoverflow.com/questions/22364886/neither-bindingresult-nor-plain-target-object-for-bean-available-as-request-attr
		modelAndView.addObject("departments", departmentService.findAll());
		modelAndView.addObject("auth", getUser());
		modelAndView.addObject("control", getUser().getRole().getRole());
		modelAndView.addObject("mode", "MODE_ALL");
		modelAndView.setViewName("department");
		
		return modelAndView;
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView updateTask(@RequestParam int id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("rule", new Department());
		modelAndView.addObject("department", departmentService.findTask(id));
		modelAndView.addObject("auth", getUser());
		modelAndView.addObject("control",getUser().getRole().getRole());
		modelAndView.addObject("mode", "MODE_UPDATE");
		modelAndView.setViewName("department");
		return modelAndView;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteTask(@RequestParam int id) {
		ModelAndView modelAndView = new ModelAndView("redirect:/admin/departments/all");
		modelAndView.addObject("rule", new Department());
		modelAndView.addObject("auth", getUser());
		modelAndView.addObject("control", getUser().getRole().getRole());
		departmentService.delete(id);
		return modelAndView;
	}

	@RequestMapping(value = "/per_inf", method = RequestMethod.GET)
	public ModelAndView infTask(@RequestParam int id, Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("rule", new Department());
		modelAndView.addObject("department", departmentService.findTask(id));
		modelAndView.addObject("userdepartment", userDepartmentService.findByDepartment(departmentService.findTask(id)));
		modelAndView.addObject("auth", getUser());
		modelAndView.addObject("control", getUser().getRole().getRole());
		modelAndView.addObject("mode", "MODE_INF");
		modelAndView.setViewName("department");

		
		List<String> countryObject = Arrays.asList(" ","Алматы","Нур-Султан","Талдыкорган","Кызылорда","Шымкент","Тараз");
		model.addAttribute("countryObject",countryObject);
		List<String> nationalObject = Arrays.asList(" ","Казах","Русский","Украинц","Узбек","Татар","Уйгыр");
		model.addAttribute("nationalObject",nationalObject);
		List<String> genderObject = Arrays.asList(" ","Женский","Мужской");
		model.addAttribute("genderObject",genderObject);
		List<String> familyObject = Arrays.asList(" ","Замужем","Женат","Не замужем","Не женат");
		model.addAttribute("familyObject",familyObject);
		return modelAndView;
	}

	private User getUser(){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		return user;
	}
}
