package com.example.servletjspdemo.domain;

public class Person {
	
	private String firstName;
	private String lastName;
	private int yob;
	private String gender;
	private String[] towns;
	private String[] languages;
	private String additionalInfo;
	
	public enum languagesEnum { C, Java, PHP, JavaScript, Python, Perl, Ruby}
	public enum townsEnum { Gdańsk, Gdynia, Sopot, Kartuzy }
	public enum genderEnum { Male, Female }
	
	public Person() {
		super();
	}
	
	public Person(String firstName, String lastName, int yob, String gender, String[] towns, String[] languages, String additionalInfo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.yob = yob;
		this.gender = gender;
		this.towns = towns;
		this.languages = languages;
		this.additionalInfo = additionalInfo;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getTowns() {
		return towns;
	}
	public String getTownsValue(int i) {
		return towns[i];
	}
	public int getTownsLength() {
		return towns.length;
	}
	public void setTowns(String[] towns) {
		this.towns = towns;
	}
	public String[] getLanguages() {
		return languages;
	}
	public String getLanguagesValue(int i) {
		return languages[i];
	}
	public int getLanguagesLength() {
		return languages.length;
	}
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	public String getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
}