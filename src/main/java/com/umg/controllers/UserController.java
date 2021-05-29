package com.umg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.models.Role;
import com.umg.models.User;
import com.umg.services.IRoleService;
import com.umg.services.IUserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private IUserService service;
	
	@Autowired
	private IRoleService serviceRol;
	
	@GetMapping("list")
	public List<User> list() {
		return service.findAll();
	}
	
	@PostMapping("save/role/{id}")
	public User save(@ModelAttribute User user, @PathVariable Long id) {
		Role rol = serviceRol.findById(id);
		if (rol != null) {
			user.setUserStatus("ACTIVE");
			user.setRole(rol);
			return service.save(user);
		} else {
			return null;
		}
	}
}
