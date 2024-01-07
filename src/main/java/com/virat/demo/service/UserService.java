package com.virat.demo.service;

import com.virat.demo.model.User;

public interface UserService {
	public String register(User u);
	public String login(String email, String pass);

}
