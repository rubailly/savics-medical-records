package com.savics.medicalrecords.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Medical Record entity.
 */
@Entity
public class MedicalRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String medicalRecordId;
	private String firtName;
	private String lastName;

	public enum Gender {
		MALE, FEMALE;
	};
	private Gender gender;
	private String city;
	private String country;

	public enum LivingWithDiabetes {
		YES, NO, UNKNOWN;
	};
	private LivingWithDiabetes livingWithDiabetes;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMedicalRecordId() {
		return medicalRecordId;
	}

	public void setMedicalRecordId(String medicalRecordId) {
		this.medicalRecordId = medicalRecordId;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LivingWithDiabetes getLivingWithDiabetes() {
		return livingWithDiabetes;
	}

	public void setLivingWithDiabetes(LivingWithDiabetes livingWithDiabetes) {
		this.livingWithDiabetes = livingWithDiabetes;
	}
	
}
