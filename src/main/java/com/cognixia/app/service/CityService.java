package com.cognixia.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.app.model.City;
import com.cognixia.app.repository.CityRepository;

@Service
@Transactional
public class CityService {
	
	@Autowired
	CityRepository cityRepository;
	
	//get all cities service
	public List<City> getAllCities() {
		return cityRepository.findAll();
	}

	public City getCityById(Integer city_id) {
		return cityRepository.findByCityid(city_id);
	}

	public List<String> getAllCapitalCities(Integer isCapital) {
		return cityRepository.getCapitalsWithCountryName(isCapital);
	}
	
	public List<City> getAllCitiesForCountry(Integer country_id) {
		return cityRepository.findCitiesByCountryid(country_id);
	}

	public List<City> getCapitalByCountryId(Integer country_id, Integer is_capital) {
		return cityRepository.findCapitalByCountryid(country_id, is_capital);
	}

}
