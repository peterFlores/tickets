package com.umg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umg.dao.IRoleDAO;
import com.umg.models.Role;

@Service
public class RoleServiceImpl implements IRoleService {
	
	@Autowired
	private IRoleDAO service;

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return (List<Role>) service.findAll();
	}

	@Override
	public Role findById(Long id) {
		// TODO Auto-generated method stub
		return service.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		service.deleteById(id);
		
	}

	@Override
	public Role save(Role role) {
		// TODO Auto-generated method stub
		return service.save(role);
	}

}
