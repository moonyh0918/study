package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UsersRepository;

@Service
public class LoginService {

	@Autowired
	private UserPLasswordHash userPasswordHashclass;
	
	@Autowired
	private UsersRepository usersRepository;
	
	public String login(String userId, String userPw) {
		
	
		if(userId.equals("") || userPw.equals("")) {
		return "login";
		}
		
		
		String hashedPassword = userPasswordHashclass.getSHA256(userPw);
		
		
		User users =usersRepository.findByUserIdAndUserPw(userId, hashedPassword);
		
		if(users ==null) {
			return "login";
			
		}
		
		return "index";
	}
	
	
	
}
