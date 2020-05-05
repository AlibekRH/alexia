
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

import com.alexia.service.TeacherService;
import com.alexia.service.TeacherTaskService;
import com.alexia.model.Teacher;

@Controller
@RequestMapping("/admin/teachers")
public class TeacherController {


	@Autowired
	private TeacherService teacherService;
	
	@Autowired
	private TeacherTaskService teacherTaskService;

	@Autowired
	private UserService userService;

	@RequestMapping(value="/new", method = RequestMethod.GET)
	public ModelAndView newTask(Model model){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("teacher", new Teacher());
		modelAndView.addObject("teachers", teacherService.findAll());
		modelAndView.addObject("auth", getUser());
		modelAndView.addObject("control", getUser().getRole().getRole());
		modelAndView.addObject("mode", "MODE_NEW");
		modelAndView.setViewName("teacher");
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
	public ModelAndView saveTask(@Valid Teacher teacher, BindingResult bindingResult) {
		teacher.setDateCreated(new Date());
		teacherService.save(teacher);
		ModelAndView modelAndView = new ModelAndView("redirect:/admin/teachers/all");
		modelAndView.addObject("auth", getUser());
		modelAndView.addObject("control", getUser().getRole().getRole());
		return modelAndView;
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ModelAndView allTasks() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("rule", new Teacher());
		modelAndView.addObject("teachers", teacherService.findAll());
		modelAndView.addObject("auth", getUser());
		modelAndView.addObject("control", getUser().getRole().getRole());
		modelAndView.addObject("mode", "MODE_ALL");
		modelAndView.setViewName("teacher");
		return modelAndView;
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView updateTask(@RequestParam int id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("rule", new Teacher());
		modelAndView.addObject("teacher", teacherService.findTask(id));
		modelAndView.addObject("auth", getUser());
		modelAndView.addObject("control",getUser().getRole().getRole());
		modelAndView.addObject("mode", "MODE_UPDATE");
		modelAndView.setViewName("teacher");
		return modelAndView;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteTask(@RequestParam int id) {
		ModelAndView modelAndView = new ModelAndView("redirect:/admin/teachers/all");
		modelAndView.addObject("rule", new Teacher());
		modelAndView.addObject("auth", getUser());
		modelAndView.addObject("control", getUser().getRole().getRole());
		teacherService.delete(id);
		return modelAndView;
	}

	@RequestMapping(value = "/per_inf", method = RequestMethod.GET)
	public ModelAndView infTask(@RequestParam int id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("rule", new Teacher());
		modelAndView.addObject("teacher", teacherService.findTask(id));
		modelAndView.addObject("userteacher", teacherTaskService.findByTeacher(teacherService.findTask(id)));
		modelAndView.addObject("auth", getUser());
		modelAndView.addObject("control", getUser().getRole().getRole());
		modelAndView.addObject("mode", "MODE_INF");
		modelAndView.setViewName("teacher");
		return modelAndView;
	}

	private User getUser(){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		return user;
	}
}
