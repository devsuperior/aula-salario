package com.devsuperior.aulaspring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GeorgiaTaxService implements TaxService {

	@Override
	public double tax(double amount) {
		return amount * 0.2;
	}
}
