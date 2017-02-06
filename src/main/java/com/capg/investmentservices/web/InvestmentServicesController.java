package com.capg.investmentservices.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capg.investmentservices.model.Investment;
import com.capg.investmentservices.service.InvestmentService;

@RestController
@ComponentScan("com.capg.investmentservices")
@EnableAutoConfiguration
public class InvestmentServicesController {
	
	@Autowired
	private InvestmentService investmentService;

	@CrossOrigin
	@RequestMapping(value="/investmentservices/{customerId}/investments",method = RequestMethod.GET)
	public List<Investment> getCardList(@PathVariable Integer customerId) {
		return this.investmentService.getAllInvestment(customerId);
	}
}
