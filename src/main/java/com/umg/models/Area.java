package com.umg.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "area")
public class Area  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 146076994721670061L;
	
	@Id
	@Column(name = "AREA_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idArea;
	
	@Column(name = "AREA_NAME")
	private String areaName;
	
	@Column(name = "AREA_DESCRIPTION")
	private String areaDescription;

	public Area() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdArea() {
		return idArea;
	}

	public void setIdArea(Long idArea) {
		this.idArea = idArea;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaDescription() {
		return areaDescription;
	}

	public void setAreaDescription(String areaDescription) {
		this.areaDescription = areaDescription;
	}

	
	
}
