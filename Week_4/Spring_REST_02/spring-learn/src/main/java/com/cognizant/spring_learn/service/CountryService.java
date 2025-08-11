package com.cognizant.spring_learn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.country;
@Service
public class CountryService {
	private final ApplicationContext context;;
	public CountryService(ApplicationContext context) {
		this.context=context;
	}
	
	public  country getCountry() {
		country coun= (country) context.getBean("countryIN");
		return coun;
	}
	public List<country> getAllCountries() {
		List<country> countries=new ArrayList<>();
		String[] idStrings=context.getBeanDefinitionNames();
		for(String id:idStrings) {
			Object object=context.getBean(id);
			if (object instanceof country) {
	            countries.add((country) object);
	        }
		}
		return countries;
     }
	public country getCountryByCode(String code) {
		return getAllCountries().stream()
                .filter(c -> c.getCodeString().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
	}
}