package com.training;

public class SourceApp {

	private String country;
	private String place;
	private long population;
	
	public SourceApp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SourceApp(String country, String place, long population) {
		super();
		this.country = country;
		this.place = place;
		this.population = population;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "SourceApp [country=" + country + ", place=" + place + ", population=" + population + "]";
	}
	
	
}
