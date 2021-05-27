package com.umg.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "project")
public class Project  implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8500945627882082109L;

	@Id
	@Column(name = "PROJECT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProject;
	
	@Column(name = "PROJECT_NAME")
	private String projectName;
	
	@Column(name = "PROJECT_DESCRIPTION")
	private String projectDescription;
	
	@Column(name = "PROJECT_PROGRESS")
	private String projectProgress;
	
	@Column(name = "PROJECT_STATUS")
	private String projectStatus;
	
	@OneToMany(mappedBy = "project", fetch = FetchType.EAGER)
	@JsonManagedReference
	private List<Activity> activities;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdProject() {
		return idProject;
	}

	public void setIdProject(Long idProject) {
		this.idProject = idProject;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getProjectProgress() {
		return projectProgress;
	}

	public void setProjectProgress(String projectProgress) {
		this.projectProgress = projectProgress;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	
}
