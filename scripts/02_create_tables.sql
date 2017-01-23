  
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