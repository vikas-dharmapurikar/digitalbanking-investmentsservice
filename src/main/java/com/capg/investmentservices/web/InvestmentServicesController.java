package com.capg.investmentservices.web;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.capg.investmentservices.model.Investment;
import com.capg.investmentservices.service.InvestmentService;
import io.dropwizard.hibernate.UnitOfWork;

@Path("/investmentservices")
@Produces(MediaType.APPLICATION_JSON)
public class InvestmentServicesController {

	private InvestmentService investmentService;

	public InvestmentServicesController(InvestmentService investmentService) {
		this.investmentService = investmentService;
	}

	@Path("/{customerId}/investments")
	@GET
	@UnitOfWork
	public List<Investment> getCardList(@PathParam("customerId") int customerId) {
		return this.investmentService.getAllInvestment(customerId);
	}
}
