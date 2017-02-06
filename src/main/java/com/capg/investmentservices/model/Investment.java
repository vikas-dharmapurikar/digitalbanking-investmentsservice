package com.capg.investmentservices.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration	
@Component
@Entity
@Table(name = "INVESTMENT")
public class Investment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "investment_id")
	private Long investmentId;

	@Column(name = "investment_type")
	private String investmentType;

	@Column(name = "investment_name")
	private String investmentName;

	@Column(name = "rate_of_interest")
	private double rateOfInterest;

	@Column(name = "investment_amount")
	private double investmentAmount;

	@Column(name = "investment_period")
	private int investmentPeriod;

	@Column(name = "customer_id")
	private int customerId;

	public Long getInvestmentId() {
		return investmentId;
	}

	public void setInvestmentId(Long investmentId) {
		this.investmentId = investmentId;
	}

	public String getInvestmentType() {
		return investmentType;
	}

	public void setInvestmentType(String investmentType) {
		this.investmentType = investmentType;
	}

	public String getInvestmentName() {
		return investmentName;
	}

	public void setInvestmentName(String investmentName) {
		this.investmentName = investmentName;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public double getInvestmentAmount() {
		return investmentAmount;
	}

	public void setInvestmentAmount(double investmentAmount) {
		this.investmentAmount = investmentAmount;
	}

	public int getInvestmentPeriod() {
		return investmentPeriod;
	}

	public void setInvestmentPeriod(int investmentPeriod) {
		this.investmentPeriod = investmentPeriod;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Investment [investmentId=" + investmentId + ", investmentType=" + investmentType + ", investmentName="
				+ investmentName + ", rateOfInterest=" + rateOfInterest + ", investmentAmount=" + investmentAmount
				+ ", investmentPeriod=" + investmentPeriod + ", customerId=" + customerId + "]";
	}
}