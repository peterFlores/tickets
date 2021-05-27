package com.umg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.umg.models.Project;

public interface IProjectDAO extends CrudRepository<Project, Long> {
	@Query("SELECT u FROM Project u WHERE u.projectStatus = :status")
	List<Project> findProjectByStatus(
	  @Param("status") String status);
}
