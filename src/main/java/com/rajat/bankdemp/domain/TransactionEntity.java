package com.rajat.bankdemp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="transaction")
@Entity
public class TransactionEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transaction_id")
	private Integer transactionId;
	
	@ManyToOne
	@JoinColumn(name="user_account_registration_id")
	private UserAccountRegistrationEntity  accountRegistrationEntity;
	
	@Column(name="amount")
	private float amount;
	
	@Column(name="transaction_type")
	private String transactionType;

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public UserAccountRegistrationEntity getAccountRegistrationEntity() {
		return accountRegistrationEntity;
	}

	public void setAccountRegistrationEntity(UserAccountRegistrationEntity accountRegistrationEntity) {
		this.accountRegistrationEntity = accountRegistrationEntity;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public String toString() {
		return "TransactionEntity [transactionId=" + transactionId + ", accountRegistrationEntity="
				+ accountRegistrationEntity + ", amount=" + amount + ", transactionType=" + transactionType + "]";
	}
}
