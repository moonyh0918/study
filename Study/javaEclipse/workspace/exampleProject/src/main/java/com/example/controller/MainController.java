package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/*
 * 요청에 맞는 페이지로 이동시켜주는 역활
 */

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String ides() {
		return "index";
	}
	
	@RequestMapping("/joinPage")
	public String joinPage() {
		return "join";
	}
	
	@RequestMapping("/longinPage")
	public String loginPage() {
		return "login";
	}

}
