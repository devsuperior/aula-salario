package com.devsuperior.aulaspring.services;

import org.springframework.stereotype.Service;

@Service
public class BrazilTaxService implements TaxService {

	@Override
	public double tax(double amount) {
		return amount * 0.275;
	}
}
