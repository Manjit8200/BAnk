package com.rajat.bankdemp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="branch_master")
@Entity
public class BranchEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="branch_id")
	private Integer branchId;
	
	@Column(name="branch_name")
	private String branchName;
	
	@Column(name="location")
	private String location;

	public Integer getBranchId() {
		return branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "BranchEntity [branchId=" + branchId + ", branchName=" + branchName + ", location=" + location + "]";
	}
	
}
