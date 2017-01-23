package com.capg.investmentservices.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "investment")
@NamedQueries({
		@NamedQuery(name = "com.capg.investmentservices.investment.GetByCustomerId", query = " from Investment c where c.customer_id = :customerId") })
public class Investment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "investment_id")
	private int investment_id;

	@Column(name = "investment_type")
	private String investment_type;

	@Column(name = "investment_name")
	private String investment_name;

	@Column(name = "rate_of_interest")
	private double rate_of_interest;

	@Column(name = "investment_amount")
	private double investment_amount;

	@Column(name = "investment_period")
	private int investment_period;

	@Column(name = "customer_id")
	private int customer_id;

	public int getInvestment_id() {
		return investment_id;
	}

	public void setInvestment_id(int investment_id) {
		this.investment_id = investment_id;
	}

	public String getInvestment_type() {
		return investment_type;
	}

	public void setInvestment_type(String investment_type) {
		this.investment_type = investment_type;
	}

	public String getInvestment_name() {
		return investment_name;
	}

	public void setInvestment_name(String investment_name) {
		this.investment_name = investment_name;
	}

	public double getRate_of_interest() {
		return rate_of_interest;
	}

	public void setRate_of_interest(double rate_of_interest) {
		this.rate_of_interest = rate_of_interest;
	}

	public double getInvestment_amount() {
		return investment_amount;
	}

	public void setInvestment_amount(double investment_amount) {
		this.investment_amount = investment_amount;
	}

	public int getInvestment_period() {
		return investment_period;
	}

	public void setInvestment_period(int investment_period) {
		this.investment_period = investment_period;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
}
