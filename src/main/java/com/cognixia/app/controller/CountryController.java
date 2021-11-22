package com.cognixia.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.app.model.City;
import com.cognixia.app.model.Country;
import com.cognixia.app.service.CityService;
import com.cognixia.app.service.CountryService;

@RestController
@RequestMapping("/api/countries")
@CrossOrigin("*")
public class CountryController {
	
	@Autowired
	CountryService countryService;
	@Autowired
	CityService cityService;
	
	private static final Logger logger = LoggerFactory.getLogger(CountryController.class);

	//Get all countries
	@GetMapping()
	public List<Country> getAllCountries() {
		logger.info("Get all countries called...");
		return countryService.getAllCountries();
	}
	
	//Get country by countryId
	@GetMapping("/{country_id}")
	public Country getCountryById(@PathVariable Integer country_id) {
		logger.info("Get country by country id called...");
		return countryService.getCountryById(country_id);
	}
	
	@GetMapping("/continents")   
	public List<Country> getCountriesByContinent(@RequestParam String continent) {
		logger.info("Get all countries by continent called...");
	    return countryService.getCountriesByContinent(continent);
	}
	
	/*********************************City Country ****************/

	@GetMapping("/{country_id}/cities")
	public List<City> getAllCitiesForACountry(@PathVariable Integer country_id) {
		logger.info("Get all cities for a country called...");
		return cityService.getAllCitiesForCountry(country_id);
	}

	//get capital city for a country
	@GetMapping("/{country_id}/cities/{capital}")
	public List<City> getCapitalByCountryId(@PathVariable Integer country_id, @PathVariable Integer capital) {
		logger.info("Get all cities for a country called...");
		return cityService.getCapitalByCountryId(country_id, capital);
	}

}
