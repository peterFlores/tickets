package com.umg.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "activity")
public class Activity {
	
	@Id
	@Column(name = "ACTIVITY_ID")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long idActivity;
	
	@Column(name = "ACTIVITY_NAME")
	private String activityName;
	
	@Column(name = "ACTIVITY_DESCRIPTION")
	private String activityDescription;
	
	@Column(name = "ACTIVITY_STATUS")
	private String activityStatus;
	
	@Column(name = "ACTIVITY_TIME")
	private Date activityTime;
	
	@Column(name = "ACTIVITY_COST")
	private Double activityCost;
	
	@Column(name = "ACTIVITY_PROGRESS")
	private Double activityProgress;
	
	@ManyToOne
	@JoinColumn(name = "USER_TECH", referencedColumnName = "USER_ID")
	private User userTech;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name = "PROJECT_ID", referencedColumnName = "PROJECT_ID")
	private Project project;
	
	

	public Long getIdActivity() {
		return idActivity;
	}



	public void setIdActivity(Long idActivity) {
		this.idActivity = idActivity;
	}



	public String getActivityName() {
		return activityName;
	}



	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}



	public String getActivityDescription() {
		return activityDescription;
	}



	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}



	public String getActivityStatus() {
		return activityStatus;
	}



	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}



	public Date getActivityTime() {
		return activityTime;
	}



	public void setActivityTime(Date activityTime) {
		this.activityTime = activityTime;
	}



	public Double getActivityCost() {
		return activityCost;
	}



	public void setActivityCost(Double activityCost) {
		this.activityCost = activityCost;
	}



	public Double getActivityProgress() {
		return activityProgress;
	}



	public void setActivityProgress(Double activityProgress) {
		this.activityProgress = activityProgress;
	}



	public User getUserTech() {
		return userTech;
	}



	public void setUserTech(User userTech) {
		this.userTech = userTech;
	}



	public Project getProject() {
		return project;
	}



	public void setProject(Project project) {
		this.project = project;
	}



	public Activity() {
		// TODO Auto-generated constructor stub
	}

}
