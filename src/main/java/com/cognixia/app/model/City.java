package com.cognixia.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="City")
public class City {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CityId")
	private Integer cityid;
	@Column(name="Name")
	private String name;
	@Column(name="CountryId")
	private Integer countryid;
	@Column(name="Capital")
	private boolean capital;
	@Column(name="FirstLandmark")
	private String firstlandmark;
	@Column(name="SecondLandmark")
	private String secondlandmark;
	@Column(name="ThirdLandmark")
	private String thirdlandmark;
	
	public City() {
		super();
	}

	public City(Integer cityid, String name, Integer countryid, boolean capital, String firstlandmark,
			String secondlandmark, String thirdlandmark) {
		super();
		this.cityid = cityid;
		this.name = name;
		this.countryid = countryid;
		this.capital = capital;
		this.firstlandmark = firstlandmark;
		this.secondlandmark = secondlandmark;
		this.thirdlandmark = thirdlandmark;
	}

	public Integer getCityid() {
		return cityid;
	}

	public void setCityid(Integer cityid) {
		this.cityid = cityid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCountryid() {
		return countryid;
	}

	public void setCountryid(Integer countryid) {
		this.countryid = countryid;
	}

	public boolean isCapital() {
		return capital;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	public String getFirstlandmark() {
		return firstlandmark;
	}

	public void setFirstlandmark(String firstlandmark) {
		this.firstlandmark = firstlandmark;
	}

	public String getSecondlandmark() {
		return secondlandmark;
	}

	public void setSecondlandmark(String secondlandmark) {
		this.secondlandmark = secondlandmark;
	}

	public String getThirdlandmark() {
		return thirdlandmark;
	}

	public void setThirdlandmark(String thirdlandmark) {
		this.thirdlandmark = thirdlandmark;
	}

	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", name=" + name + ", countryid=" + countryid + ", capital=" + capital
				+ ", firstlandmark=" + firstlandmark + ", secondlandmark=" + secondlandmark + ", thirdlandmark="
				+ thirdlandmark + "]";
	}

}
