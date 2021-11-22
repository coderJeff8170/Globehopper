package com.cognixia.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.app.model.City;
import com.cognixia.app.service.CityService;

@RestController
@RequestMapping("/api/cities")
@CrossOrigin("*")
public class CityController {
	
	@Autowired
	CityService cityService;
	
	private static final Logger logger = LoggerFactory.getLogger(CityController.class);

	//Get all cities
	@GetMapping()
	public List<City> getAllCities() {
		logger.info("Get all cities called");
		return cityService.getAllCities();
	}
	
	//Get city by id
	@GetMapping("/{city_id}")
	public City getCityById(@PathVariable Integer city_id) {
		logger.info("Get city by id called");
		return cityService.getCityById(city_id);
	}
	
	//get all capital cities (with country name)
	@GetMapping("/capitals/{capital}")
    public List<String> getAllCapitalCities(@PathVariable Integer capital) {
		logger.info("Get all capital cities called");
        return cityService.getAllCapitalCities(capital);
    }

}
