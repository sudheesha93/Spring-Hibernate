package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
 private String firstName;
 private String lastName;
 private String country;
 private String gender;
 private String[] hoobies;
 private LinkedHashMap<String, String> countryOptions;
 
 public Student() {
	 
	 //populate countryoptions 
	 countryOptions=new LinkedHashMap<>();
	 
	 countryOptions.put("BR", "Brazil");
	 countryOptions.put("IN", "India");
	 countryOptions.put("AUS", "Australia");
	 countryOptions.put("CHi", "China");
	 countryOptions.put("US", "UnitedStates");
	  
 }

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public LinkedHashMap<String, String> getCountryOptions() {
	return countryOptions;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String[] getHoobies() {
	return hoobies;
}

public void setHoobies(String[] hoobies) {
	this.hoobies = hoobies;
}


}
