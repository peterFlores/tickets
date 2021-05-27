package com.umg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.models.Role;
import com.umg.services.IRoleService;

@RestController
@RequestMapping("role")
public class RoleController {
	
	@Autowired
	private IRoleService service;
	
	@GetMapping("list")
	public List<Role> list() {
		return service.findAll();
	}

	@PostMapping("save")
	public Role save(@ModelAttribute Role role) {
		return service.save(role);
	}
}
