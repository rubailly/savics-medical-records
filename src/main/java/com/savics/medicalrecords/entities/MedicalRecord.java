package com.savics.medicalrecords.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Medical Record entity.
 */
@Entity
@Table(name = "medical_record")
public class MedicalRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	public enum Gender {
		MALE, FEMALE;
	};

	@Column(name = "gender")
	private Gender gender;

	@Column(name = "age")
	private int age;

	@Column(name = "city")
	private String city;

	@Column(name = "country")
	private String country;

	public enum LivingWithDiabetes {
		YES, NO, UNKNOWN;
	};

	@Column(name = "living_with_diabetes")
	private LivingWithDiabetes livingWithDiabetes;

	public MedicalRecord() {
	}

	public MedicalRecord(String firstName, String lastName, Gender gender, int age, String city, String country,
			LivingWithDiabetes livingWithDiabetes) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.city = city;
		this.country = country;
		this.livingWithDiabetes = livingWithDiabetes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LivingWithDiabetes getLivingWithDiabetes() {
		return livingWithDiabetes;
	}

	public void setLivingWithDiabetes(LivingWithDiabetes livingWithDiabetes) {
		this.livingWithDiabetes = livingWithDiabetes;
	}

}
