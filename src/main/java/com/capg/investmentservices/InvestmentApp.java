package com.capg.investmentservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.capg.investmentservices.dao.InvestmentDAO;
import com.capg.investmentservices.model.Investment;
import com.capg.investmentservices.service.InvestmentService;
import com.capg.investmentservices.service.impl.InvestmentServiceImpl;
import com.capg.investmentservices.web.InvestmentServicesController;

import io.dropwizard.Application;
import io.dropwizard.configuration.ResourceConfigurationSourceProvider;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class InvestmentApp extends Application<InvestmentConfiguration> {
	private static final Logger LOGGER = LoggerFactory.getLogger(InvestmentApp.class);

	private final HibernateBundle<InvestmentConfiguration> hibernate = new HibernateBundle<InvestmentConfiguration>(
			Investment.class) {
		public DataSourceFactory getDataSourceFactory(InvestmentConfiguration configuration) {
			return configuration.getDataSourceFactory();
		}
	};

	@Override
	public void initialize(Bootstrap<InvestmentConfiguration> b) {
		b.addBundle(hibernate);
		b.setConfigurationSourceProvider(new ResourceConfigurationSourceProvider());

	}

	@Override
	public void run(InvestmentConfiguration c, Environment e) throws Exception {
		LOGGER.info("Registering REST resources");
		final InvestmentDAO investmentDAO = new InvestmentDAO(hibernate.getSessionFactory());
		final InvestmentService investmentService = new InvestmentServiceImpl(investmentDAO);
		e.jersey().register(new InvestmentServicesController(investmentService));
	}

	public static void main(String[] args) throws Exception {
		new InvestmentApp().run(args);
	}
}