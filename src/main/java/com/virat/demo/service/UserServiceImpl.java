package com.virat.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virat.demo.model.User;
import com.virat.demo.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo ur;

	@Override
	public String register(User u) {
		if(ur.existsById(u.getEmail())) {
			return "Email already registered";
		}
		else {
			ur.save(u);
			return "Account created";
		}
	}

	@Override
	public String login(String email, String pass) {
		if(ur.existsById(email)) {
			User u = ur.findById(email).get();
			if(u.getPassword().equals(pass)) {
				return "login successful";
			}
			else {
				return "login failed";
			}
		}
		else {
			return "login failed";
		}
	}

}
