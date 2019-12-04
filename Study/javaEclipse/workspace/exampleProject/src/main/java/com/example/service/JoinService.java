package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UsersRepository;


@Service
public class JoinService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private UserPLasswordHash userPasswordHashClass;
	
	public String joinUser(String userId, String userPw, String userName) {
		
		if(userId.equals("")||userPw.equals("")||userName.equals("")) {
			return "join";
		}
		User users = new User();
		users.setUserId(userId);
		
		String hashedPassword = userPasswordHashClass.getSHA256(userPw);
		users.setUserPw(hashedPassword);
		users.setUserName(userName);
		
		usersRepository.save(users);
		return "index";
	}

}
