package com.cognizant.spring_learn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.country;
import com.cognizant.spring_learn.service.CountryService;

@RestController

public class CountryController {
	Logger logger=LoggerFactory.getLogger(CountryController.class); 
    private final CountryService countryService;
    public CountryController(CountryService countryService) {
    	this.countryService=countryService;
    }
	@RequestMapping("/country")
	public country getCountry() {
		return countryService.getCountry();
	}
	@RequestMapping("/countries")
	public List<country> getAllCountries() {
		logger.info("gotAllcountries");
		return countryService.getAllCountries();
		
	}
	@RequestMapping("/countries/{code}")
	public country getCountryByCode(@PathVariable String code) {
		return countryService.getCountryByCode(code);
	}
}
