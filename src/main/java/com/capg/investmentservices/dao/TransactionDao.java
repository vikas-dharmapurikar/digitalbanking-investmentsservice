package com.capg.investmentservices.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.investmentservices.model.Transaction;

@Repository
@Transactional
public interface TransactionDao extends JpaRepository<Transaction,Integer> {
	
	@Query("SELECT p FROM Transaction p WHERE folioNo = ?1 "
			+ "and valueDate between ?2 AND ?3 ORDER by valueDate DESC")
	List<Transaction> getTransactions(Integer accountNo, Date startDate, Date endDate);
}
