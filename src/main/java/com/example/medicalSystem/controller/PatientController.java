package com.example.medicalSystem.controller;

import com.example.medicalSystem.pojo.AuthUser;
import com.example.medicalSystem.pojo.Doctor;
import com.example.medicalSystem.pojo.Patient;
import com.example.medicalSystem.pojo.PatientForm;
import com.example.medicalSystem.repository.PatientRepository;
import com.example.medicalSystem.service.PatientService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PatientController {

    @Autowired
    private PatientService patientService; // 注入 Service 而非 Repository

    @PostMapping("/registerPatient")
    public ModelAndView registerPatient(@ModelAttribute("patientForm") PatientForm form) {
        try {
            // 调用 Service 执行复杂的业务逻辑
            patientService.registerPatient(form);
            return new ModelAndView("login", "message", "Registration successful!");
        } catch (Exception e) {
            return new ModelAndView("register-patient", "error", "Registration failed: " + e.getMessage());
        }
    }
}
