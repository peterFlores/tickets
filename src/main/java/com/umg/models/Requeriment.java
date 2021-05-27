package com.umg.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "requirement")
public class Requeriment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2542367650615581992L;

	@Id
	@Column(name = "REQ_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReq;
	
	@Column(name = "REQ_NAME")
	private String reqName;

	@Column(name = "REQ_DESCRIPTION")
	private String reqDescription;
	
	@Column(name = "REQ_STATUS")
	private String reqStatus;
	
	@ManyToOne
	@JoinColumn(name = "AREA_ID", referencedColumnName = "AREA_ID")
	private Area area;
	
	@ManyToOne
	@JoinColumn(name = "USER_REQ", referencedColumnName = "USER_ID")
	private User userReq;
	
	@ManyToOne
	@JoinColumn(name = "USER_RECEIVER", referencedColumnName = "USER_ID")
	private User userReceiver;
	
	@Column(name = "CREATE_AT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
	
	@Column(name = "UPDATE_AT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateAt;

	public Requeriment() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdReq() {
		return idReq;
	}

	public void setIdReq(Long idReq) {
		this.idReq = idReq;
	}

	public String getReqName() {
		return reqName;
	}

	public void setReqName(String reqName) {
		this.reqName = reqName;
	}

	public String getReqDescription() {
		return reqDescription;
	}

	public void setReqDescription(String reqDescription) {
		this.reqDescription = reqDescription;
	}

	public String getReqStatus() {
		return reqStatus;
	}

	public void setReqStatus(String reqStatus) {
		this.reqStatus = reqStatus;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public User getUserReq() {
		return userReq;
	}

	public void setUserReq(User userReq) {
		this.userReq = userReq;
	}

	public User getUserReceiver() {
		return userReceiver;
	}

	public void setUserReceiver(User userReceiver) {
		this.userReceiver = userReceiver;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	@Override
	public String toString() {
		return "Requeriment [idReq=" + idReq + ", reqName=" + reqName + ", reqDescription=" + reqDescription
				+ ", reqStatus=" + reqStatus + ", area=" + area + ", userReq=" + userReq + ", userReceiver="
				+ userReceiver + ", createAt=" + createAt + ", updateAt=" + updateAt + "]";
	}
	
	

}
