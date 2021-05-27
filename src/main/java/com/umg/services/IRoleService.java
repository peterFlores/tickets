package com.umg.services;

import java.util.List;

import com.umg.models.Role;

public interface IRoleService {

	public List<Role> findAll();
	public Role findById(Long id);
	public void deleteById(Long id);
	public Role save(Role role);
}
