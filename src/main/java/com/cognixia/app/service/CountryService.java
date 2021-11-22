package com.cognixia.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.app.model.Country;
import com.cognixia.app.repository.CountryRepository;

@Service
@Transactional
public class CountryService {
	
	@Autowired
	CountryRepository countryRepository;
	
	//get all countries service
	public List<Country> getAllCountries() {
		return countryRepository.findAll();
	}

	public Country getCountryById(Integer id) {
		return countryRepository.findByCountryid(id);
	}

	public List<Country> getCountriesByContinent(String continent) {
		return countryRepository.findAllByContinent(continent);
	}

}
