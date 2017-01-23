package com.capg.investmentservices.service.impl;

import java.util.List;
import com.capg.investmentservices.dao.InvestmentDAO;
import com.capg.investmentservices.model.Investment;
import com.capg.investmentservices.service.InvestmentService;

public class InvestmentServiceImpl implements InvestmentService {

	private InvestmentDAO investmentDAO;

	public InvestmentServiceImpl(InvestmentDAO investmentDAO) {
		super();
		this.investmentDAO = investmentDAO;
	}

	public List<Investment> getAllInvestment(int customerId) {
		return investmentDAO.findByCustomerId(customerId);
	}

	public Investment getInvestmentDetails(int investmentId) {
		return investmentDAO.findByInvestmentNo(investmentId);
	}
}