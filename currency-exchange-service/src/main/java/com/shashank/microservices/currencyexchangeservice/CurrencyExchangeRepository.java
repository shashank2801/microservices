package com.shashank.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>{
	CurrencyExchange findByFromCAndToC(String from,String to);
}
