package com.indus.service;

import com.indus.entity.User;

public interface UserI {
	
	public void register(User user);
	
	public User getAll(String id);
	
	public String getAll();

}
