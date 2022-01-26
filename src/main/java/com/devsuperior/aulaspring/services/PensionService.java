package com.devsuperior.aulaspring.services;

import org.springframework.stereotype.Service;

@Service
public class PensionService {

	double discount(double amount) {
		return amount * 0.1;
	}
}
