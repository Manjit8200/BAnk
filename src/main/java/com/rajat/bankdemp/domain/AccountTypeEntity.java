package com.rajat.bankdemp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_type")
public class AccountTypeEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="account_type_id")
	private Integer accountTypeId;
	
	@Column(name="account_name")
	private String accountName;
	
	@Column(name="rate_of_interest")
	private Float rateOfInterest;

	public Integer getAccountTypeId() {
		return accountTypeId;
	}

	public void setAccountTypeId(Integer accountTypeId) {
		this.accountTypeId = accountTypeId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(Float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	@Override
	public String toString() {
		return "AccountTypeEntity [accountTypeId=" + accountTypeId + ", accountName=" + accountName
				+ ", rateOfInterest=" + rateOfInterest + "]";
	}
	
	
	
}
