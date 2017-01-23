package com.capg.investmentservices.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.capg.investmentservices.model.Investment;

import io.dropwizard.hibernate.AbstractDAO;

public class InvestmentDAO extends AbstractDAO<Investment> {

	public InvestmentDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public List<Investment> findByCustomerId(int customerId) {
		return list(namedQuery("com.capg.investmentservices.investment.GetByCustomerId").setParameter("customerId",
				customerId));
	}

	public Investment findByInvestmentNo(long investmentNo) {
		return get(investmentNo);
	}
}
