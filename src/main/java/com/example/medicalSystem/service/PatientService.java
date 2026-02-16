package com.example.medicalSystem.service;

import com.example.medicalSystem.pojo.Patient;
import com.example.medicalSystem.pojo.PatientForm;

public interface PatientService {
    Patient registerPatient(PatientForm form);
}
