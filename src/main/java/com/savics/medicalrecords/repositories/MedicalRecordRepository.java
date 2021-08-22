package com.savics.medicalrecords.repositories;

import org.springframework.data.repository.CrudRepository;

import com.savics.medicalrecords.entities.MedicalRecord;

public interface MedicalRecordRepository extends CrudRepository<MedicalRecord, Integer> {

}
