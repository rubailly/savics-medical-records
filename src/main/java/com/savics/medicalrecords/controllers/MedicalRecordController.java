package com.savics.medicalrecords.controllers;

import com.savics.medicalrecords.entities.MedicalRecord;
import com.savics.medicalrecords.services.MedicalRecordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Medical Record Controller.
 */
@Controller
public class MedicalRecordController {

    private MedicalRecordService medicalRecordService;

    @Autowired
    public void setMedicalRecordService(MedicalRecordService medicalRecordService) {
        this.medicalRecordService = medicalRecordService;
    }

    /**
     * List all medical records.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/medicalRecords", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("medicalRecords", medicalRecordService.listAllMedicalRecords());
        System.out.println("Returning medical records:");
        return "medicalRecords";
    }

    /**
     * View a specific medical record by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("medicalRecord/{id}")
    public String showMedicalRecord(@PathVariable Integer id, Model model) {
        model.addAttribute("medicalRecord", medicalRecordService.getMedicalRecordById(id));
        return "medicalRecordShow";
    }

    @RequestMapping("medicalRecord/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("medicalRecord", medicalRecordService.getMedicalRecordById(id));
        return "medicalRecordForm";
    }

    /**
     * New medicalRecord.
     *
     * @param model
     * @return
     */
    @RequestMapping("medicalRecord/new")
    public String newmedicalRecord(Model model) {
        model.addAttribute("medicalRecord", new MedicalRecord());
        return "medicalRecordForm";
    }

    /**
     * Save medicalRecord to database.
     *
     * @param medicalRecord
     * @return
     */
    @RequestMapping(value = "medicalRecord", method = RequestMethod.POST)
    public String saveMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecordService.saveMedicalRecord(medicalRecord);
        return "redirect:/medicalRecord/" + medicalRecord.getId();
    }

    /**
     * Delete medicalRecord by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("medicalRecord/delete/{id}")
    public String deleteMedicalRecord(@PathVariable Integer id) {
        medicalRecordService.deleteMedicalRecord(id);
        return "redirect:/medicalRecord";
    }

}
