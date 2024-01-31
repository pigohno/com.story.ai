package com.story.ai.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.story.ai.main.service.MainService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping({""})
@Slf4j
public class KongController {
	
	@Autowired
	MainService mainService;
	
	@GetMapping("/")
	public String index(Model model) {	
		model.addAttribute("message", "Hello, Thymeleaf!");
		return "index";
	}
	
	@GetMapping("/main")
	public String gateway(Model model) {
		return "main/main";
	}
}
