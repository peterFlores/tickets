package com.umg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umg.dao.IProjectDAO;
import com.umg.models.Project;

@Service
public class ProjectServiceImpl implements IProjectService {

	@Autowired
	private IProjectDAO service;
	
	@Override
	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return (List<Project>) service.findAll();
	}

	@Override
	public Project findById(Long id) {
		// TODO Auto-generated method stub
		return service.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		service.deleteById(id);
		
	}

	@Override
	public Project save(Project project) {
		// TODO Auto-generated method stub
		return service.save(project);
	}

	@Override
	public List<Project> findProjectByStatus(String status) {
		// TODO Auto-generated method stub
		return (List<Project>) service.findProjectByStatus(status);
	}
	
}
