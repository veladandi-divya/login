package com.dwaith.a2zgoogleapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dwaith.a2zgoogleapp.entity.A2zgoogle;
import com.dwaith.a2zgoogleapp.service.A2zgoogleService;



@Controller
public class A2zgoogleController {
	
	private A2zgoogleService a2zgoogleService;

	public A2zgoogleController(A2zgoogleService a2zgoogleService) {
		super();
		this.a2zgoogleService = a2zgoogleService;
	}
	
	// handler method to handle list students and return mode and view
	/*
	 * @GetMapping("/students") public String listStudents(Model model) {
	 * model.addAttribute("students", studentService.getAllStudents()); return
	 * "students"; }
	 */
	
	@GetMapping("/a2zgoogle")
	public String listA2zgoogle(Model model) {
		System.out.println("a2zgoogle listA2zgoogle Method Invoked...........");
		model.addAttribute("a2zgoogle", a2zgoogleService.getAllA2zgoogle());
		System.out.println("a2zgoogle listA2zgoogle Method Ended...........");
		return "a2zgoogle";
	}
	
	@GetMapping("/a2zgoogle/sub")
	public String createA2zgoogleSub(Model model) {
		System.out.println("a2zgoogle createA2zgoogleSub Method Invoked...........");
		// create student object to hold student form data
		A2zgoogle 	a2zgoogle = new A2zgoogle();
		//model.addAttribute("a2zgoogle", a2zgoole );
		model.addAttribute("a2zgoogle", a2zgoogle);
		System.out.println("a2zgoogle createA2zgoogleSub Method Ended...........");
		return "google";
		//return "A2zSubcribe";
		
	}
	
	@GetMapping("/a2zgoogle/new")
	public String createA2zgoogleForm(Model model) {
		
		// create student object to hold student form data
		A2zgoogle 	a2zgoogle = new A2zgoogle();
		//model.addAttribute("a2zgoogle", a2zgoole );
		model.addAttribute("a2zgoogle", a2zgoogle);
		return "create_a2zgoole";
		
	}
	
	@PostMapping("/a2zgoogle")
	public String saveA2zgoogle(@ModelAttribute("a2zgoogle") A2zgoogle a2zgoogle) {
		a2zgoogleService.saveA2zgoogle(a2zgoogle);
		return "redirect:/a2zgoogle";
	}
	
	@GetMapping("/a2zgoogle/edit/{id}")
	public String editA2zgoogleForm(@PathVariable Long id, Model model) {
		System.out.println("editA2zgoogleForm Method Invoked and redirected to edit_a2zgoogle.html page");
		model.addAttribute("a2zgoogle", a2zgoogleService.getA2zgoogleById(id));
		return "edit_a2zgoogle";
	}

	@PostMapping("/a2zgoogle/{id}")
	public String updateA2zgoogle(@PathVariable Long id,
			@ModelAttribute("a2zgoogle") A2zgoogle a2zgoogle,
			Model model) {
		System.out.println("updateA2zgoogle Method Invoked and redirected to a2zgoogle.html page");
		// get student from database by id
		A2zgoogle existinga2zgoogle = a2zgoogleService.getA2zgoogleById(id);
		existinga2zgoogle.setId(id);
		existinga2zgoogle.setFirstName(a2zgoogle.getFirstName());
		existinga2zgoogle.setPassword(a2zgoogle.getPassword());
		existinga2zgoogle.setConfirmpassword(a2zgoogle.getConfirmpassword());
		existinga2zgoogle.setEmail(a2zgoogle.getEmail());
		existinga2zgoogle.setUrl(a2zgoogle.getUrl());
		existinga2zgoogle.setCatagory(a2zgoogle.getCatagory());
		
		// save updated student object
		a2zgoogleService.updateA2zgoogle(existinga2zgoogle);
		return "redirect:/a2zgoogle";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/a2zgoogle/{id}")
	public String deleteA2zgoogle(@PathVariable Long id) {
		a2zgoogleService.deleteA2zgoogleById(id);
		return "redirect:/a2zgoogle";
	}
	
}
