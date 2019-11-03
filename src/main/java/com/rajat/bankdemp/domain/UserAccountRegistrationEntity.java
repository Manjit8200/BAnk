package com.rajat.bankdemp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_account_registration")
public class UserAccountRegistrationEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_account_registration_id")	
	private Integer UserAccountRegistrationId;
	
	@Column(name="account_number")
	private String accountNumber;
	
	@Column(name="balance")
	private float balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BranchEntity getBranchEntity() {
		return branchEntity;
	}

	public void setBranchEntity(BranchEntity branchEntity) {
		this.branchEntity = branchEntity;
	}

	@OneToOne
	@JoinColumn(name="user_id")
	private UserEntity userEntity;
	
	@OneToOne
	@JoinColumn(name="account_type_id")
	private AccountTypeEntity accountTypeEntity;
	
	@ManyToOne
	@JoinColumn(name="branch_id")
	private BranchEntity branchEntity;



	public Integer getUserAccountRegistrationId() {
		return UserAccountRegistrationId;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void setUserAccountRegistrationId(Integer userAccountRegistrationId) {
		UserAccountRegistrationId = userAccountRegistrationId;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public AccountTypeEntity getAccountTypeEntity() {
		return accountTypeEntity;
	}

	public void setAccountTypeEntity(AccountTypeEntity accountTypeEntity) {
		this.accountTypeEntity = accountTypeEntity;
	}

	@Override
	public String toString() {
		return "UserAccountRegistrationEntity [UserAccountRegistrationId=" + UserAccountRegistrationId
				+ ", accountNumber=" + accountNumber + ", balance=" + balance + ", userEntity=" + userEntity
				+ ", accountTypeEntity=" + accountTypeEntity + ", branchEntity=" + branchEntity + "]";
	}	
	
}
