package com.cognixia.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognixia.app.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {
	

//	List<Country> findByContinent(String continent);
	
	//jpa creates queries using POJO naming convention, yet lines them up to db with @column name!!
	Country findByCountryid(Integer id);
	
	//select * from country where continent = "North America"
	@Query(value="select * from Country c where c.continent = ?1", nativeQuery=true)
	List<Country> findCountriesByContinent(String continent);
	
	List<Country> findAllByContinent(String continent);

}
