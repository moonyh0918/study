package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/*
 * ��û�� �´� �������� �̵������ִ� ��Ȱ
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
