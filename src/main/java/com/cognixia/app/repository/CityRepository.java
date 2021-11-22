package com.cognixia.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognixia.app.model.City;

public interface CityRepository extends JpaRepository<City, Integer> {

	City findByCityid(Integer cityid);

	//List<City> getByCapital(boolean b); <-returns only a list of capital city objects
	
	@Query(value="select ct.name as cityname, cn.name as countryname from City ct join Country cn on cn.countryid = ct.countryid where ct.capital = ?1", nativeQuery=true)
	List<String> getCapitalsWithCountryName(Integer capital);
	
	List<City> findCitiesByCountryid(Integer countryid);
	
	//returns capital of a country on capital=1, and one city that is not a capital on 0
	@Query(value="select * from City ct join Country cn on ct.countryid = cn.countryid where cn.countryid = ?1 and ct.capital = ?2", nativeQuery=true)
	List<City> findCapitalByCountryid(Integer countryid, Integer capital);

}
