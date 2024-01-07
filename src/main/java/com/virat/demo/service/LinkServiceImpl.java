package com.virat.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virat.demo.model.Link;
import com.virat.demo.repo.LinkRepo;

@Service
public class LinkServiceImpl implements LinkService{
	
	@Autowired
	private LinkRepo lr;

	@Override
	public String addLink(Link l) {
		String n = l.getName();
		if(lr.existsById(l.getName()) || n.equalsIgnoreCase("login") || n.equalsIgnoreCase("register")  || n.equalsIgnoreCase("Login") 
				|| n.equalsIgnoreCase("Registration")  || n.equalsIgnoreCase("link") || n.length()<4) {
			return "name taken or not valid";
		}
		else {
			lr.save(l);
			return "created";
		}
	}

	@Override
	public Link findLink(String name) {
		if(lr.existsById(name)) {
			Link l = lr.findById(name).get();
			return l;
		}
		else {
			return null;
		}
	}

}
