package com.satish.sprinboot.web.springbootfirstwebapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.satish.sprinboot.web.springbootfirstwebapplication.service.TodoService;

@Controller
public class TodoController {

	@Autowired
	TodoService todoService;
	
	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showLoginPage(ModelMap modelMap) {
		modelMap.put("todos", todoService.retrieveTodos("in28Minutes"));
		return "list-todos";
	} 
}