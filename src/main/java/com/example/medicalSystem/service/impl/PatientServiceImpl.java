package com.example.medicalSystem.service.impl;

import com.example.medicalSystem.pojo.*;
import com.example.medicalSystem.repository.PatientRepository;
import com.example.medicalSystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    @Transactional // 确保账号、联系方式、病人信息同时保存成功
    public Patient registerPatient(PatientForm form) {
        // 1. 组装 AuthUser
        AuthUser user = new AuthUser();
        user.setUsername(form.getUsername());
        user.setPassword(form.getPassword());
        user.setRole("patient");

        // 2. 组装 ContactInfo
        ContactInfo info = new ContactInfo();
        info.setEmail(form.getEmail());
//        info.setPhone(form.getPhone());
//        info.setAddress(form.getAddress());

        // 3. 组装 Patient
        Patient patient = new Patient();
//        patient.setFirst_name(form.getFirstName());
//        patient.setLast_name(form.getLastName());
        patient.setSex(form.getSex());
//        patient.setAuthUser(user);
        patient.setContactInfo(info);

        // 4. 调用 Repository 保存
        return patientRepository.save(patient);
    }
}
