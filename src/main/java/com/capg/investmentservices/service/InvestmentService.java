package com.capg.investmentservices.service;

import java.util.List;

import com.capg.investmentservices.model.Investment;

public interface InvestmentService {

	List<Investment> getAllInvestment(int customerId);

	Investment getInvestmentDetails(int investmentId);
}
