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