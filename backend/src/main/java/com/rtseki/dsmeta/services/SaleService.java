package com.rtseki.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rtseki.dsmeta.entities.Sale;
import com.rtseki.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	SaleRepository saleRepository;
		
	public List<Sale> findSales() {
		return saleRepository.findAll();
	}
}
