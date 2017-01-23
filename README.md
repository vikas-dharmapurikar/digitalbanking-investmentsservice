# digitalbanking Investment Microservice
Digital Banking Training

We are in the process of dockerizing this.

mvn clean install
Run InvestmentApp.java from com.capg.investmentservices package

This is a drop wizard application
It will run embedded jetty container.

To run
java –jar investment.jar server configuration.yml

To test, start postman app in chrome
http://localhost:8150/investmentservices/556677/investment

You have to create db_investments database in postgresql.
Use sql scripts to create the tables and insert the data.

