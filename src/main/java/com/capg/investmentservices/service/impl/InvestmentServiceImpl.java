package com.capg.investmentservices.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.investmentservices.dao.InvestmentDAO;
import com.capg.investmentservices.model.Investment;
import com.capg.investmentservices.service.InvestmentService;
/***
 * Investment service implementation for investment DB
 * @author sujillel
 *
 */
@Service
public class InvestmentServiceImpl implements InvestmentService {
	
	static Logger logger = Logger.getLogger(InvestmentServiceImpl.class);
	
	@Autowired
	private InvestmentDAO investmentDAO;

	public List<Investment> getAllInvestment(Integer customerId) {
		if(customerId == null) {
			logger.warn("Invalid customerId for finding investment list By CustomerId : "+customerId);
			return null;
		}
		return investmentDAO.findByCustomerId(customerId);
	}

	public Investment getInvestmentDetails(Long investmentId) {
		if(investmentId == null) {
			logger.warn("Invalid investmentId for finding investment list By CustomerId : "+investmentId);
			return null;
		}
		return investmentDAO.findByInvestmentId(investmentId);
	}
}