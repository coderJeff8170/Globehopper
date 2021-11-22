package com.cognixia.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Country")
public class Country {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CountryId")
	private Integer countryid;
	@Column(name="Name")
	private String name;
	@Column(name="Population")
	private Integer population;
	@Column(name="Continent")
	private String continent;
	@Column(name="Image")
	private String image;

	public Country() {
		super();
	}
	
	public Country(Integer countryid, String name, Integer population, String continent) {
		super();
		this.countryid = countryid;
		this.name = name;
		this.population = population;
		this.continent = continent;
		this.image = image;
	}
	public Integer getCountryid() {
		return countryid;
	}
	public void setCountryid(Integer countryid) {
		this.countryid = countryid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Country [countryid=" + countryid + ", name=" + name + ", population=" + population + ", continent="
				+ continent + "]";
	}

}
