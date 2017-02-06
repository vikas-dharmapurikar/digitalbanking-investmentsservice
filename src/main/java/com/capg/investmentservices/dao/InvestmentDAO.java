package com.capg.investmentservices.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.investmentservices.model.Investment;

public interface InvestmentDAO extends JpaRepository<Investment,Integer> {

	public List<Investment> findByCustomerId(Integer customerId);
	public Investment findByInvestmentId(Long investmentId);
}