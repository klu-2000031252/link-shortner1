package com.virat.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virat.demo.model.Link;
import com.virat.demo.model.User;
import com.virat.demo.service.LinkService;
import com.virat.demo.service.UserService;

@Controller
public class MyController {
	@Autowired
	private UserService us;
	
	@Autowired
	private LinkService ls;
	
	
	
	@GetMapping("/{name}")
	public String redirect1(@PathVariable String name) {
		Link l = ls.findLink(name);
		if(l== null){
			return "register";
		}
		if(l.getIsActive()==1) {
			if(l.getUrl().substring(0, 4).equalsIgnoreCase("http")) {
				return "redirect:"+l.getUrl();
			}
			else {
				return "redirect:https://"+l.getUrl();
			}
		}
		else {
			return "error";
		}
		
		
	}
	@RequestMapping("/")
	public String index() {
		return "register";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/link")
	public String link() {
		return "linkForm";
	}
	@RequestMapping(path = "Registration", method = RequestMethod.POST)
	public String register(HttpServletRequest request) {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String repass = request.getParameter("repass");
		User u = new User();
		String ack = "";
		u.setFname(fname);
		u.setLname(lname);
		u.setEmail(email);
		u.setPassword(pass);
		if(pass.equals(repass)) {
			ack+=us.register(u);
			if(ack.equals("Account created")) {
				return "login";
			}
			else {
				request.setAttribute("Uack", ack);
				return "register";
			}
		}
		else {
			ack+="password donot match";
			request.setAttribute("Uack", ack);
			return "register";
		}
	}//registration
	@RequestMapping(path = "Login", method = RequestMethod.POST)
	public String login(HttpServletRequest request) {
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String ack = us.login(email, pass);
		if(ack.equals("login successful")) {
			return "linkForm";
		}
		else {
			request.setAttribute("Loginack", ack);
			return "login";
		}
	}//Login
	
	@RequestMapping(path = "Link", method = RequestMethod.POST)
	public String addLink(HttpServletRequest request) {
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		Link l = new Link();
		l.setIsActive(1);
		l.setName(name);
		l.setUrl(url);
		String ack = ls.addLink(l);
		request.setAttribute("Lack", ack);
		return "linkForm";
	}

}
