package com.rtseki.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rtseki.dsmeta.entities.Sale;
import com.rtseki.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")

public class SaleController {

	@Autowired
	SaleService saleService;
	
	@GetMapping
	public List<Sale> findSales() {
		return saleService.findSales();
	}
}
