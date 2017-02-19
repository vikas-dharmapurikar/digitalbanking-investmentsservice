INSERT INTO customer (customer_id, customer_name, password, last_login, mobile_no, email_id) VALUES
(556677,	'Raja',	'capg123',	NULL,	NULL, 'a@a.com');

INSERT INTO customer (customer_id, customer_name, password, last_login, mobile_no, email_id) VALUES
(556678, 'Mahesh', 'capg123',	NULL,	NULL, 'b@b.com');

INSERT INTO investment (investment_id, investment_type, investment_name, rate_of_interest, investment_amount, investment_period, customer_id) VALUES
(2000,	'FD',	'Fixed Deposite', 7.45,	5000, 1,	556677);

INSERT INTO investment (investment_id, investment_type, investment_name, rate_of_interest, investment_amount, investment_period, customer_id) VALUES
(2001,	'Recurring Deposit', 'Term Deposit', 8.00,	10000,	2,	556677);

INSERT INTO investment (investment_id, investment_type, investment_name, rate_of_interest, investment_amount, investment_period, customer_id) VALUES
(2002,	'Recurring Deposit', 'Term Deposit', 8.00,	10000,	2,	556678);

INSERT INTO public.investment_transaction ( scheme_name, cost_of_current_holding, sno, unrealised_loss_gain, avg_cost, nav, folio_no, current_value, unrealised_loss_gain_percent, quantity) VALUES ( 'Mutual Fund'::character varying, '123234'::numeric, '1'::numeric, '45678.56'::numeric, '15.23'::numeric, '120'::numeric, '2000'::numeric, '45678.56'::numeric, '13'::numeric, '1500'::numeric);	
UPDATE public.investment_transaction SET value_date = '2017-02-02'::date WHERE sno = 1;	