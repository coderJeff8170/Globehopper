package com.cognixia.app.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognixia.app.model.Country;
import com.cognixia.app.service.CountryService;


@SpringBootTest
class CountryControllerTest {
	
//	@Mock
//	CountryService service;
//	
//	@InjectMocks
//	CountryController countryController;
//
//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}
//
//	@BeforeEach
//	void setUp() throws Exception {
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//	}
//
//	//@Test
//	void testGetAllCountries() {
//		//given
//		Country country1 = new Country(1,  "United States of America", 300000000, "North America");
//		Country country2 = new Country(2,  "England", 27000000, "Europe");
//		List<Country> countries = new ArrayList<Country>(Arrays.asList(country1, country2));
//		//when
//		when(service.getAllCountries()).thenReturn(countries);
//		System.out.println(countries);
//        List<Country> result = countryController.getAllCountries();
// 
//        // then
//        assertThat(result.size()).isEqualTo(2);
//        assertThat(result.get(0).getName())
//        .isEqualTo(country1.getName());
//        assertThat(result.get(1).getName())
//        .isEqualTo(country2.getName());
//	}

//	@Test
//	void testGetCountryById() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetCountriesByContinent() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetAllCitiesForACountry() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetCapitalByCountryId() {
//		fail("Not yet implemented");
//	}

}
