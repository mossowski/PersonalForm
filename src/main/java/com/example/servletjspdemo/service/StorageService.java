package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletjspdemo.domain.Person;

public class StorageService {
	
	private List<Person> db = new ArrayList<Person>();
	
	public void add(Person person){
		Person newPerson = new Person(person.getFirstName(), person.getLastName(), person.getYob(), person.getGender(), person.getTowns(), person.getLanguages(), person.getAdditionalInfo());
		db.add(newPerson);
	}
	public List<Person> getAllPersons(){
		return db;
	}
}