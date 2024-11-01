package com.currencyconversion.conversion_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="exchange-service")
public interface CurrencyExchangeProxy {
	
	@GetMapping("/change/{from}/{to}")
	public ConvertedCurrency getChangeRate(@PathVariable String from,@PathVariable String to);

}
