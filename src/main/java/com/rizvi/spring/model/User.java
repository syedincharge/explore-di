package com.rizvi.spring.model;

import java.util.List;

import javax.persistence.*;

import io.micrometer.core.lang.NonNull;


@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	@OneToMany(cascade = CascadeType.ALL,  mappedBy ="user")
	private List<Address> addresses;
	
	int age;
	String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddress(List<Address> addresses) {
		this.addresses = addresses;
	}

	
	

	
}