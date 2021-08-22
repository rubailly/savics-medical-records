package com.savics.medicalrecords.services;

import com.savics.medicalrecords.entities.MedicalRecord;
import com.savics.medicalrecords.repositories.MedicalRecordRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * MedicalRecord service implement.
 */
@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

    private MedicalRecordRepository medicalRecordRepository;

    @Autowired
    public void setMedicalRecordRepository(MedicalRecordRepository medicalRecordRepository) {
        this.medicalRecordRepository = medicalRecordRepository;
    }

    @Override
    public Iterable<MedicalRecord> listAllMedicalRecords() {
        return medicalRecordRepository.findAll();
    }

    @Override
    public MedicalRecord getMedicalRecordById(Integer id) {
        return medicalRecordRepository.findOne(id);
    }

    @Override
    public MedicalRecord saveMedicalRecord(MedicalRecord medicalRecord) {
        return medicalRecordRepository.save(medicalRecord);
    }

    @Override
    public void deleteMedicalRecord(Integer id) {
        medicalRecordRepository.delete(id);
    }

}
