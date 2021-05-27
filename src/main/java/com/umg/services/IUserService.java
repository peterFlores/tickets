package com.umg.services;

import java.util.List;

import com.umg.models.User;

public interface IUserService {
	public List<User> findAll();
	public User findById(Long id);
	public void deleteById(Long id);
	public User save(User user);
}
