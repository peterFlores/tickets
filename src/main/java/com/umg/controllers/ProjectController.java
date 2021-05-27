package com.umg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.umg.models.Project;
import com.umg.services.IProjectService;

@RestController
@RequestMapping("project")
public class ProjectController {
	@Autowired
	private IProjectService service;
	
	@GetMapping("list")
	public List<Project> list() {
		return service.findAll();
	}
	
	@PostMapping("save")
	public Project save(@ModelAttribute Project project) {
		project.setProjectStatus("EN PROCESO");
		project.setProjectProgress(String.valueOf(0.0));
		return service.save(project);
	}
	
	@PostMapping("update/project/{id}")
	public Project save (@PathVariable Long id, @RequestParam  String status) {
		Project project = service.findById(id);
		project.setProjectStatus(status);
		return service.save(project);
	}
	
	@GetMapping("list/prostatus/{status}")
	public List<Project> list(@PathVariable String status) {
		return service.findProjectByStatus(status);
	}
}
