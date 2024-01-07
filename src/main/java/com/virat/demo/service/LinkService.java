package com.virat.demo.service;

import com.virat.demo.model.Link;

public interface LinkService {
	public String addLink(Link l);
	public Link findLink(String name);

}
