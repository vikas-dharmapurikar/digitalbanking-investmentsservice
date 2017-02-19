package com.capg.investmentservices.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "investment_transaction", catalog="postgres", schema="public")
public class Transaction implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="sno")
	private int transactionId; 
	
	@Column(name="value_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date valueDate;
	
	@Column(name="scheme_name")
	private String schemeName; 
	
	@Column(name="folio_no")
	private Integer folioNo; 

	@Column(name="quantity")
	private String quantity;
	
    @Column(name="avg_cost")
	private Double avgCost;
    
    @Column(name="cost_of_current_holding")
    private Double costOfCurrentHolding;
    
    @Column(name="nav")
    private Double nav;
    
    @Column(name="current_value")
    private Double currentValue;
    
    @Column(name="unrealised_loss_gain")
    private Double unrealisedLossGain;
    
    @Column(name="unrealised_loss_gain_percent")
    private Double unrealisedLossGainPercent;

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public Integer getFolioNo() {
		return folioNo;
	}

	public void setFolioNo(Integer folioNo) {
		this.folioNo = folioNo;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Double getAvgCost() {
		return avgCost;
	}

	public void setAvgCost(Double avgCost) {
		this.avgCost = avgCost;
	}

	public Double getCostOfCurrentHolding() {
		return costOfCurrentHolding;
	}

	public void setCostOfCurrentHolding(Double costOfCurrentHolding) {
		this.costOfCurrentHolding = costOfCurrentHolding;
	}

	public Double getNav() {
		return nav;
	}

	public void setNav(Double nav) {
		this.nav = nav;
	}

	public Double getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(Double currentValue) {
		this.currentValue = currentValue;
	}

	public Double getUnrealisedLossGain() {
		return unrealisedLossGain;
	}

	public void setUnrealisedLossGain(Double unrealisedLossGain) {
		this.unrealisedLossGain = unrealisedLossGain;
	}

	public Double getUnrealisedLossGainPercent() {
		return unrealisedLossGainPercent;
	}

	public void setUnrealisedLossGainPercent(Double unrealisedLossGainPercent) {
		this.unrealisedLossGainPercent = unrealisedLossGainPercent;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", valueDate=" + valueDate + ", schemeName=" + schemeName
				+ ", folioNo=" + folioNo + ", quantity=" + quantity + ", avgCost=" + avgCost + ", costOfCurrentHolding="
				+ costOfCurrentHolding + ", nav=" + nav + ", currentValue=" + currentValue + ", unrealisedLossGain="
				+ unrealisedLossGain + ", unrealisedLossGainPercent=" + unrealisedLossGainPercent + "]";
	}
}