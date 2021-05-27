package com.umg.services;

import java.util.List;


import com.umg.models.Project;

public interface IProjectService {
	public List<Project> findAll();
	public Project findById(Long id);
	public void deleteById(Long id);
	public Project save(Project project);
	public List<Project> findProjectByStatus(String status);
}
