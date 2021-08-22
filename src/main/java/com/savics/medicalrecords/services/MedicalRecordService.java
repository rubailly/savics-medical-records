package com.savics.medicalrecords.services;

import com.savics.medicalrecords.entities.MedicalRecord;

public interface MedicalRecordService {

    Iterable<MedicalRecord> listAllMedicalRecords();

    MedicalRecord getMedicalRecordById(Integer id);

    MedicalRecord saveMedicalRecord(MedicalRecord medicalRecord);

    void deleteMedicalRecord(Integer id);

}
