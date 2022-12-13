package com.indus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indus.entity.User;
import com.indus.repository.UserRepository;

@Service
public class UserServiceImpl implements UserI{
@Autowired
	private UserRepository repo;

@Override
public void register(User user) {
	repo.save(user);
	
}

@Override
public User getAll(String id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getAll() {
	// TODO Auto-generated method stub
	return null;
}


}
