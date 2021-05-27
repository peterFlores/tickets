package com.umg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umg.dao.IUserDAO;
import com.umg.models.User;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDAO service;
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return (List<User>) service.findAll();
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return service.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		service.deleteById(id);
		
	}

	@Override
	public User save(User role) {
		// TODO Auto-generated method stub
		return service.save(role);
	}

	
}
