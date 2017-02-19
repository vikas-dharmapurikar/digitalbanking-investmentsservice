  
--DROP TABLE public.customer;
CREATE TABLE public.customer (
  customer_id int NOT NULL,
  customer_name character varying(10) NOT NULL,
  password character varying(20) DEFAULT NULL,
  last_login date DEFAULT NULL,
  mobile_no character varying(15) DEFAULT NULL,
  email_id character varying(50) NOT NULL,   
  PRIMARY KEY (customer_id)   
) WITH (
    OIDS = FALSE
)TABLESPACE pg_default;

ALTER TABLE public.customer
    OWNER to postgres;
    
    --DROP TABLE public.card;    
CREATE TABLE public.investment
(
  investment_id int NOT NULL,
  investment_type character varying(20) NOT NULL,
  investment_name character varying(20),
  rate_of_interest double precision NOT NULL,
  investment_amount double precision,
  investment_period int,
  customer_id int NOT NULL,
  CONSTRAINT pk_investment_id PRIMARY KEY (investment_id), 
  CONSTRAINT customer_customerid_fkey FOREIGN KEY (customer_id)
  REFERENCES public.customer (customer_id) MATCH SIMPLE    
) WITH (
    OIDS = FALSE
)TABLESPACE pg_default;

ALTER TABLE public.investment
    OWNER to postgres;
    
CREATE TABLE public.investment_transaction
(
    sno numeric(16) NOT NULL,
    scheme_name character varying(100),
    folio_no numeric(16),
    quantity numeric(10),
    avg_cost numeric(10, 2),
    cost_of_current_holding numeric(10, 2),
    nav numeric(10, 2),
    current_value numeric(10, 2),
    unrealised_loss_gain numeric(10, 2),
    unrealised_loss_gain_percent numeric(5, 2),
    value_date date,
    PRIMARY KEY (sno)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.investment_transaction
    OWNER to postgres;
    