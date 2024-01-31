package com.story.ai.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.story.ai.main.service.MainService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping({"/main"})
@Slf4j
public class MainController {
	
	@Autowired
	MainService mainService;
	
	@GetMapping("/card1")
	public ResponseEntity<?> getCard1(HttpServletRequest request, HttpServletResponse response) {
		log.info("call card1");
		return ResponseEntity.ok(mainService.getCard1(request, response));
	}
	
	@GetMapping("/card2")
	public ResponseEntity<?> getCard2(HttpServletRequest request, HttpServletResponse response) {
		log.info("call card2");
		return ResponseEntity.ok(mainService.getCard2(request, response));
	}
}
