package com.currencyconversion.conversion_service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeProxy proxy;
	
	@GetMapping("/change/{from}/{to}/{qunatity}")
	public ConvertedCurrency getConvertedCurrency(@PathVariable String from,
			@PathVariable String to,@PathVariable BigDecimal qunatity) {
		ConvertedCurrency converted_currency= proxy.getChangeRate(from, to);
		converted_currency.setQunatity(qunatity);
		converted_currency.setTotalAmount(qunatity.multiply(converted_currency.getChangerate()));
		return converted_currency;
	}

}
